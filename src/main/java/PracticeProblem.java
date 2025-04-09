public class PracticeProblem {
// import array
    public static int[] compareSearch(int[] array, int number) {
        int[] finale = new int[2];
        
        
        finale[1] = binarySearch(array, number);

        finale[0] = sequentialSearch(array, number); /////
        
        return finale;
    }


    public static int[] compareStringSearch(String[] arraystring, String word) {
        int[] finalnum = new int[2];
        
        finalnum[1] = binarySearch(arraystring, word);
        finalnum[0] = sequentialSearch(arraystring, word);
        
        
        //final[0] =
        return finalnum;
    }

//println
    private static int sequentialSearch(int[] arrayseq, int number) {
        int loops = 0;
        for (int i = 0; i < arrayseq.length; i++) {
            loops++;
            if (arrayseq[i] == number) {
                return loops;
            }
        }
        return loops;
    }

    private static int binarySearch(int[] arraybinary, int number) {
        int left = 0, right = arraybinary.length - 1;
        int loops = 0;
        
        while (left <= right) {
            loops++;
            int mid = left + (right - left) / 2;
            
            if (arraybinary[mid] == number) {
                return loops;
            }
            if (arraybinary[mid] < number) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return loops;
    }
//
 //pri
    private static int sequentialSearch(String[] arrayseq2, String word) {
        int loops = 0;
        for (int i = 0; i < arrayseq2.length; i++) {
            loops++;
            if (arrayseq2[i].equals(word)) {
                return loops;
            }
        }
        return loops;
    }
//print
    private static int binarySearch(String[] arraybin2, String word) {
        int left = 0, right = arraybin2.length - 1;
        int loops = 0;
        
        while (left <= right) {
            loops++;
            int mid = left + (right - left) / 2;
            
            int comparison = arraybin2[mid].compareTo(word);
            if (comparison == 0) {
                return loops;
            }
            if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return loops;
    }
	public static void main(String args[]){
	}
}

//println
