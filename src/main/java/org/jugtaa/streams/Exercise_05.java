package org.jugtaa.streams;

import java.util.function.LongPredicate;
import java.util.function.LongSupplier;
import java.util.stream.LongStream;

public class Exercise_05
{
    public static class FibonacciSupplier implements LongSupplier {
    	private long one = 1;
    	private long two = 2;
    	
		@Override
		public long getAsLong() {
			long result = one + two;
			one = two;
			two = result;
			return result;
		}

	}

	public static void main(String[] args)
    {
        // Write a Stream that generates Fibonacci numbers,
        // take from the 11th to the 20th Fibonacci number,
        // multiply only the even numbers and those that match
        // an external LongPredicate.
        // Use LongStream.generate(Supplier).
    	
    	LongPredicate extPred = n -> n > 1000;
    	System.out.println(perform(extPred));
    }

	private static long perform(LongPredicate extPred) {
    	return LongStream.generate(new FibonacciSupplier())
    		.skip(10)
    		.limit(20) // limite rispetto all'originale
    		.filter(extPred.and(n -> n % 2 == 0))
    		.reduce((p, f) -> p*f)
    		.orElse(0);
	}
}
