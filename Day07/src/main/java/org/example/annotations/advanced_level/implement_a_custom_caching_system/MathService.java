package org.example.annotations.advanced_level.implement_a_custom_caching_system;

import java.util.HashMap;
import java.util.Map;

// Expensive Computation Service
class MathService {
    private static final Map<Integer, Integer> cache = new HashMap<>();

    @CacheResult
    public int factorial(int n) {
        if (cache.containsKey(n)) {
            System.out.println("Fetching cached result for: " + n);
            return cache.get(n);
        }

        System.out.println("Computing factorial for: " + n);
        int result = (n <= 1) ? 1 : n * factorial(n - 1);
        cache.put(n, result);
        return result;
    }
}

