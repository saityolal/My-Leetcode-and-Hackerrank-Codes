import java.util.Arrays;

public class nextPermutation {

    public static void main(String[] args) {
        // Örnek bir dizi oluşturuluyor
        int[] nums = { 1, 3, 2 };
        System.err.println("Original array: " + Arrays.toString(nums));
        // Dizinin bir sonraki permütasyonu hesaplanıyor
        nextPermutationCustom(nums);

        // Yeni permütasyon ekrana yazdırılıyor
        System.out.println("Next permutation: " + Arrays.toString(nums));
    }

    private static void nextPermutationCustom(int[] nums) {
        int i = nums.length - 2;
        
        // Diziyi sağdan sola tarayarak, sıralama bozulduğu noktayı buluyoruz
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Eğer böyle bir nokta bulunduysa, daha büyük bir permütasyon oluşturulabilir
        if (i >= 0) {
            // Listenin en sağından başlamak için j'yi listenin sonuna ayarlıyoruz
            int j = nums.length - 1;

            // Sağdan sola giderek, nums[i]'den büyük olan en küçük değeri buluyoruz
            while (nums[j] <= nums[i]) {
                j--;
            }

            // Bu iki elemanı yer değiştirerek, daha büyük bir permütasyona adım atıyoruz
            swap(nums, i, j);
        }

        // Dizinin geri kalan kısmını ters çevirerek, en küçük olan permütasyonu oluşturuyoruz
        reverse(nums, i + 1);
    }

    // İki elemanın yerini değiştiren metod
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Belirtilen noktadan itibaren diziyi ters çeviren metod
    private static void reverse(int[] nums, int start) {
        int i = start;
        int j = nums.length - 1;

        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}