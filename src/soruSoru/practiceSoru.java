package soruSoru;

public class practiceSoru {
    public static void main(String[] args) {

        int[]nums={5,8,-8,9,-15,2,47,32,6,};

        int ort=0;
        int top=0;
        int min=nums[0];
        int max=nums[0];
        for (int i = 0; i <nums.length ; i++) {
            top+=nums[i];
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);

            ort=(top-(min+max))/(nums.length-2);

        }
        System.out.println("Arrayin en büyük elemanı: "+max+"arrayin en küçük elemanı: "+min+"" +
                "\n"+ "büyük ve küçük değerlerden sonra ort: "+ort);


    }


}
