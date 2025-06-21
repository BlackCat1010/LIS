import java.util.Arrays;

public class entity {
    Integer[] input;
    Integer[] LISsubsqn;
    Integer[] LDSsubsqn;

    public entity(Integer[] input){
        this.input = input;
        this.LISsubsqn = new Integer[input.length];
        this.LDSsubsqn = new Integer[input.length];
        Arrays.fill(LISsubsqn,1);
        Arrays.fill(LDSsubsqn,1);

        // Start dp Processing

        // LIS
        for(int i = 1; i < input.length;i++){
             // System.out.println("Number "+input[i]);
            for (int j = 0; j < i;j++) {
                 // System.out.println("Inner Compare "+j);
                if (input[j] < input[i]){
                    // Builds upon previously calculated and +1 or take current max.
                    LISsubsqn[i] = Math.max(LISsubsqn[i],LISsubsqn[j]+1);
                    // System.out.println("CurrentLIS: " + LISsubsqn[i]);
                }
            }
        }

        // LDS
        for(int i = input.length-2; i >= 0 ;i--){
             // System.out.println("Number "+input[i]);
            for (int j = input.length-1; j > i;j--) {
                 // System.out.println("Inner Compare "+j);
                if (input[j] < input[i]){
                    // Builds upon previously calculated and +1 or take current max.
                    LDSsubsqn[i] = Math.max(LDSsubsqn[i],LDSsubsqn[j]+1);
                    // System.out.println("CurrentLIS: " + LISsubsqn[i]);
                }
            }
        }


    }

    public Integer getLongestIncreasingSub() {
        int LISval = 1;
        for (Integer integer : LISsubsqn) {
            if (integer > LISval){
                LISval=integer;
            }
        }
        return LISval;
    }

    public Integer getLongestDecreasingSub() {
        int LDSval = 1;
        for (Integer integer : LDSsubsqn) {
            if (integer > LDSval){
                LDSval=integer;
            }
        }

        return LDSval;
    }


    public static void main(String[] args){
        // System.out.println("test");
    }
}