class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        for(int candy: candyType){
            set.add(candy);
        }
        int distinct = set.size();
        int half = candyType.length/2;
        return Math.min(distinct,half);
    }
}