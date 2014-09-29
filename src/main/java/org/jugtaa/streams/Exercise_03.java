package org.jugtaa.streams;

public class Exercise_03
{
    public static void main(String[] args)
    {
        // Sum all the x coordinates of points, in parallel.
        // Use 1-argument reduce() and 3-arguments reduce().
    	
    	System.out.println(Data.points.parallelStream()
        		.map(point -> point.x)
        		.reduce(0, (tot, x) -> tot + x, (tot1, tot2) -> tot1 + tot2));
    	System.out.println(Data.points.parallelStream()
        		.map(point -> point.x)
        		.reduce(0, Integer::sum, Integer::sum));
    	System.out.println(Data.points.parallelStream()
        		.reduce(0, (t, p) -> t + p.x, Integer::sum));

    	System.out.println(Data.points.parallelStream()
			.map(point -> point.x)
			.reduce((x1, x2) -> x1+x2));

    	System.out.println(Data.points.parallelStream()
			.mapToInt(point -> point.x)
			.reduce(Integer::sum));

    }
}
