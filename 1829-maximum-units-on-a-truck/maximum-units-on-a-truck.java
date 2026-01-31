class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {

        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int units = 0;

        for (int[] box : boxTypes) {

            // if (truckSize == 0) {
            //     break;
            // }

            // int takeBoxes = truckSize < box[0] ? truckSize : box[0];

            // units += takeBoxes * box[1];
            // truckSize -= takeBoxes;
            if(truckSize >= box[0]) {
                units+=box[0] * box[1];
                truckSize-=box[0];
            } else {
                units+=truckSize*box[1];
                truckSize = 0;
                break;
            }
           
        }

        return units;
    }
}