class Solution {
    public int mySqrt(int x) {
        if (x == 1) return x;
        long l = 0 ;
        long r = x/2;

        long m = 0;

        while( l <= r){
            m = (l + r) / 2;
            
            if (m * m == x ) return (int)m;
            if ( m * m < x) l = m+1;
            else r = m - 1;
        }

        return (int)r;

    }
}