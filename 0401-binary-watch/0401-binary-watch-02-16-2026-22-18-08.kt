class Solution {
    fun readBinaryWatch(t: Int): List<String> {
        val ans = mutableListOf<String>()

        val max:Int = 1024

        for(i in 0 until max){
            val h:Int = i.shr(6)
            val m:Int = i and 63
            if(h.countOneBits() + m.countOneBits() == t && h < 12 && m<60) ans.add("${h}:${if (m>=10) m else "0${m}"}");
        }
        return ans
    }
}