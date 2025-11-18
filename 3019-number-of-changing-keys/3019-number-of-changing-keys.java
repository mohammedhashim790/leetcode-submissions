class Solution {
    public int countKeyChanges(String s) {

        int counter = 0;
        Character prev = Character.toLowerCase(s.charAt(0));

        for(int i = 1 ; i < s.length();i++){
            Character ch = Character.toLowerCase(s.charAt(i));
            System.out.println(ch + " " + prev + " " + prev.equals(ch));
            if(!prev.equals(ch)){
                prev = ch;
                counter++;
            }

        }
        return counter;
    }
}