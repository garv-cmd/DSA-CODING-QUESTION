Tiling Problem
Given a “2 x n” board and tiles of size “2 x 1”, count the number of ways to tile the given board using the 2 x 1 tiles.
A tile can either be placed horizontally i.e., as a 1 x 2 tile or vertically i.e., as 2 x 1 tile.

 static Long numberOfWays(int N) {
        // code here
        if(N==0)
        return (long)0;
        if(N==1)
        return (long)1;
         if(N==2)
        return (long)2;
        return (numberOfWays(N-1)+numberOfWays(N-2))%1000000007;
    }
