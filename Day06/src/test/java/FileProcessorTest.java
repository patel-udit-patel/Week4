import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;
import java.nio.file.*;
import org.example.basic_junit_test.testing_file_handling_method.FileProcessor;
class FileProcessorTest {
    private FileProcessor fileProcessor;
    private String filename = "testFile.txt";

    @BeforeEach
    void setUp() {
        fileProcessor = new FileProcessor();
    }

    @Test
    void testWriteAndReadFile() throws IOException {
        // Write to file
        String content = "Hello, JUnit!";
        fileProcessor.writeToFile(filename, content);

        // Read from file and verify content
        String fileContent = fileProcessor.readFromFile(filename);
        assertEquals(content, fileContent, "Content read from file should match the written content.");
    }

    @Test
    void testFileExistsAfterWriting() throws IOException {
        // Write to file
        fileProcessor.writeToFile(filename, "Content for existence test.");

        // Verify file exists
        assertTrue(Files.exists(Paths.get(filename)), "The file should exist after writing.");
    }

    @Test
    void testIOExceptionWhenFileDoesNotExist() {
        // Attempt to read from a non-existent file and assert IOException
        assertThrows(IOException.class, () -> fileProcessor.readFromFile("nonExistentFile.txt"),
                "An IOException should be thrown when trying to read from a non-existent file.");
    }

    @AfterEach
    void tearDown() {
        // Clean up - delete the test file if it exists
        try {
            Files.deleteIfExists(Paths.get(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
