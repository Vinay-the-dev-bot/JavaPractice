package practice;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;
import java.io.*; 
import java.util.Map.Entry;

import org.junit.platform.engine.support.hierarchical.Node;

public class SwapNumber {
	int number1;
	int number2;  
	static int x = 0;
	
	class FastReader {

        BufferedReader br;
        StringTokenizer st;
  
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
  
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
  
        int nextInt() { return Integer.parseInt(next()); }
  
        long nextLong() { return Long.parseLong(next()); }
  
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
  
        String nextLine()
        {
            String str = "";
            try {
                if(st.hasMoreTokens()){
                    str = st.nextToken("\n");
                }
                else{
                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
     }
  class Node{
	  int data;
	  Node next;
	  
	  public Node(int data,Node next){
	    this.data = data;
	    this.next = next;
	  }
	  public Node(int data){
	    this.data = data;
	    this.next = null;
	  }
	  public Node(){
	    this.data = 0;
	    this.next = null;
	  }
	}	
	public static void main(String[] args) {
		char ch = '#'; 
		  String sent = "I like Java";
		sent.substring(2,4);
		sent.length();
		int age = 2;
		String citizenship = "Indian";
		int whole = 256655657;
		int digit = 0;
		int[] marks = {21, 25, 290};
		char kjskb = 'C';
        int n = 3;
        int limit = 5;
    	int[] array = {1,2,3,4,5,6,7,8,9};
        String str23 = "epxynzn"; 
        Arrays.sort(marks);
        String[] classNames =  {"Class-V", "Class-VI", "Class-VII", "Class-VIII"};
        int[] values = {1, 2, 3, 4};
//      canthepersonvote(age,citizenship);
//		swapnumbers(22,56);
//		swapnumbers("isjbv","skjjv");
//      triangle();
//    	pyramid(9);
//		sum();
//    	invertedpyramid(9);
//    	largest();
//    	LCM();
//    	HCF();
//    	arrayppts();
//    	stringmthd();
//    	reverse();
//    	palindrome("V665inayaniV");  // using sb.rev method
//		System.out.println(detectPalindrome("VinayaniV")); 
//		addingmatrices();
//		System.out.println("Change Char : " + change_char("aVijAyanagara"));
//		test();
//		System.out.println();
//    	System.out.println("Index is : " + findnum(marks));
//    	moseven();
//    	SOJvnsoknv();    
//    	StarPattern();
//    	ArrayLength(array);
//    	Average(array);
//      System.out.println(ArrayLength(array));
//      System.out.println(Average(array));
//      other();
//      freq();
//      freqHashMp();
//      namefreq();
//      a3b2();
//      elements();
//      appearOnce();	
//    	check420();
//    	maximumOccuringElement();
//    	masaiPalindromicSubstring();
//    	applyBasicMaths();
//    	swapZeroAndOne();
//      OccurencesOfTheWord(str23);
//      MergeHashMap();
//        System.out.println(CreateHashMap(classNames,values));
//      anagram();
//      reversemod3();
//      firstUniqueCharacter();
//      mapSymbolsSum();
//      partyPlanning();
//      missingVowel();
//      charactersofArray();
//      bagOfChars(); 
//      unitsConsumed(); 
//      allSubStrings();
//      subStrUnderCond(); 
//      numberofping();
//      longestNonVowelSubstring();
//      containsVowel("abcde");
//      spiralTraversal();
//        indVsNzTakingInp();
//        medicineOfLifeTakingInp();
//        pairLessThanK(); 
//        Scanner sc = new Scanner(System.in);
//        System.out.println("TC : ");
//        int tc = sc.nextInt();  
//	    int[] arr = null;
//	    int N = 0 ;
//	    int K = 0;
//	    while(tc>0) { 
//	    int max = -1; 
//	    N = sc.nextInt(); 
//	    K = sc.nextInt();
//	   	arr = new int[N];
//	    	for(int i = 0; i<N;i++){  
//	    		arr[i] = sc.nextInt();	
//	    	}  
//	    	 
//	    	tc--;
//	    	 
//	    	pairLessThanK( N, arr,K);
////	    	countTriplets(N,K,arr);
//	    } 
        //        suchpairreturns();
//        containerWithWater(); 
//        HappyNumber();
//        countTriplets2Pointer(); 
//        bubbleSorting();
//        optimumBubbleSorting();
//        selectionSorting();
//        squareRootSorting();
//        newSortintAlgorithm();
//        removetoSort();
//        ThreeMaxThreeMin();
//        pushPopTop();
//        masaiRestaurantStack();
//        findspan();
//        System.out.println(classicalStackProblem("[(])}"));
//        smallerNeighbourElementtoLeft();
//        smallerNeighbourElementtoRight();
//        reduceString();
//        nextGreaterElement(); 
//        String str = "";
//        System.out.println(stringWithParanthesis("[one[two[three[four[five[six[seven[eight[nine[ten]]]]]]]]]]"));
//        droppingBalls();
//        FastReader sc = new FastReader();
//        int tc = sc.nextInt();
//        while(tc>0){
//           String str = sc.nextLine();   
//           alanAndChristopher(str);
//            tc--; 
//        }
//        maxRetangleAreaInHistogram();
//        happyNewYear(); 
//        String queue = "abcadc";
//        String result = findFirstUniqueGift(queue); 
//        System.out.println(result ); 
//        solution();
//        nearestSmallerToLeft();
//        nearestSmallerToRight();
//        nearestGreaterToRight();
//        nearestGreaterToLeft();
//        uniqueGift("yytexfzntvbtwnjhkfzr"); 
//	        gifts();
//	        int[] gifts = {1 ,2 ,1 ,3 ,2 ,7 ,4 ,2};
//	        int longestSequence = longestUniqueGiftSequence(gifts);
//	        System.out.println("The longest sequence of successive unique gifts is: " + longestSequence);
//	        NonRepetitiveSubstrings();
//	        minNoOfCoins();
//        nearestGreaterToRight();
//        NSGProductEval3();
//        smallToLeft();
//        greatToRight();
//        System.out.println(fun(6));
//        fun2(5);
//        System.out.println();
//        int a = 2048, sum =0; 
//	    foo(a,sum);
//	   System.out.print(sum);
//	   sta(7);
//	   FastReader fr = new FastReader();
//       int tc = fr.nextInt();
//       while(tc >0){
//           int N = fr.nextInt(); 
//           int[] arr = new int[N]; 
//           for(int i = 0; i<N;i++){
//        	   int x = fr.nextInt();
//               arr[i] = x; 
//           }
//           for(int i = 0; i<N;i++) {
//        	   System.out.print(arr[i] + " ");
//           }
//             
//           GreaterAgainProduct(N, arr);
//           tc--;
//       }
//         count(1024,1024); 
//         System.out.println(fzdoo(513,2));
//         System.out.println(sumOfDigits(12345));
        
//         System.out.println(ArraySumRecursion(N,arr));    
//         System.out.println(GCD(1024 ,180)); 
//         System.out.println(StringLengthRecursion("masaischool"));
//         binary(8);
//        System.out.println( binaryRecursion(8));
//         int N = 186;
//         int x = N;
//         while( x > 10){
//            x =  superDigit(x) ; 
//         } 
//         System.out.println(x); 
//         int[] arr = {1,2,3,-5449,-154,4,5};
//         int[] arr = { 7,1,4,2,8,9,12,-3,6};
//         int N1 = arr.length;
//         System.out.println(maxOfArrayrecursion(N1, arr));
//         System.out.println(maxOfArrayrecursionAnother(0,N1-1,arr));
//         int A = 4;
//         int B = 5184;
//         int x1 = 2;
//         int y = 3;
//
//         int result = AtoB(A, B, x1, y, 0);
//
//         if (result == -1) {
//             System.out.println("-1");
//         } else {
//             System.out.println("Res : "  + result);
//         }
         int[] nums = {0,0,1,1,1,2,2,3,3,4};
         int target = 4; 
        int[] Arr = {12, 34, 45, 9, 8, 90, 3};
//        segregateEvenOdd(Arr, Arr.length);
//        segregateEvenOddAndSorted(Arr, Arr.length);
//        removeDuplicates(nums); 
//        removeElement();
//        moveZeroes();
//        Virus();
//        xSubArrays();
//        leetcode();
//        weightLifting();
//        diversity();
//        abandonCity();
//        ConsecutiveOnes();
        
//        All Done  
//        String[] students = {"jack 158 85 112", "john 168 74 124",  "arti 148 65 120", "bhuvan 182 84 124", 
//        		"navi 182 84 124",       "vijay 175 88 115",         "amit 180 89 119",  "kevin 182 77 120", 
//        		"rohit 174 85 100", "vivek 184 75 111"}; 
//        String[] students = {"jack 158 85 112", "john 168 74 124",  "arti 148 65 120", "bhuvan 182 84 120", 
//        		"navi 182 84 124",       "vijay 175 88 115",         "amit 175 88 115",  "kevin 182 77 120", 
//        		"rohit 174 85 100", "vivek 184 75 111"}; 
//        navi, john,  bhuvan, kevin,   arti,  amit,  vijay,  jack
//        String[] students = {"jack 158 85 112", "john 168 74 124",  "arti 148 65 120", "bhuvan 182 84 124", 
//        		"navi 182 80 124",       "vijay 175 89 115",         "amit 175 89 115",  "kevin 182 77 128"} ;
//        kevin,    navi,  bhuvan, john, arti,   amit, vijay, jack
//        int N = students.length;
  
//        MeritList( N,students)   ; 
        leaderboard();
       
         
    }
	
	public static void leaderboard(){
		class Students{
		    String name;
		    int marks;
			public Students(String name, int marks) { 
				this.name = name;
				this.marks = marks;
			} 
		    
		}
		String[] students = {"rancho 45","chatur 32","raju 30","farhan 28","virus 32","joy 45"}; 
		int N = students.length; 
		 Students[] students2 = new Students[N];
		for(int i = 0;i<N;i++) {
			
			String[] assa = students[i].split("\\s+");
			int x = Integer.valueOf(assa[1]);
			String str = assa[0];
			 Students stud = new Students(str, x);
			 students2[i] = stud;
			
		}
		 
		
		for(int i = 0; i<N-1;i++) {
			for(int j = 0; j<N-i-1;j++) { 
				if(students2[j].marks < students2[j+1].marks ) {
					Students temp = students2[j];
					students2[j] = students2[j+1];
					students2[j+1] = temp; 
				}else if(students2[j].marks == students2[j+1].marks ) {
					if(students2[j].name.compareTo(students2[j+1].name) > 0) {
						Students temp = students2[j];
						students2[j] = students2[j+1];
						students2[j+1] = temp; 
					}
				}
			}
		}
//		for(int i = 0; i<N;i++) {
//			System.out.println(students2[i].marks + " :--: " + students2[i].name);
//		}
		
//		for(int i = 0; i<N;i++) {
//			System.out.println(i+1 + " " +students2[i].name);
//		}
		int rank = 1;
		int lastMarks = students2[0].marks; 
		 System.out.println(1 + " " +students2[0].name);
		for(int i = 1; i<N;i++) { 
		    if(students2[i].marks==lastMarks){ 
		        System.out.println(rank + " " +students2[i].name);
		        lastMarks =  students2[i].marks;
		    } else{
		        rank = i+1;
		         System.out.println(rank + " " +students2[i].name);
			        lastMarks =  students2[i].marks;
		    } 
           
		}
		 
	}
	public static void MeritList(int N, String []students){ 
        // System.out.println("N + " +N);
        //  for(int i = 0; i<N;i++){
        //     System.out.println(students[i]); 
        //  }
        String[] names = new String[N];
        int[] heights = new int[N];
        int[] weights = new int[N];
        int[] iqs = new int[N];
       for(int i = 0 ; i<N;i++){
            
        String input = students[i];
         
        String[] parts = input.split("\\s+");
         names[i] = parts[0];
        heights[i] = Integer.valueOf(parts[1]);
         weights[i] = Integer.valueOf(parts[2]);
         iqs[i] = Integer.valueOf(parts[3]);
       }
      
        for(int i = 0; i<N-1; i++){
            for(int j = 0; j<N-1;j++){
                if(iqs[j]<iqs[j+1]){  
	                	int temp = iqs[j];
	                	iqs[j] = iqs[j+1];
	                	iqs[j+1] = temp; 
                    	int temp3 = heights[j];
                    	heights[j] = heights[j+1];
                    	heights[j+1] = temp3; 
                    	int temp4 = weights[j];
                    	weights[j] = weights[j+1];
                    	weights[j+1] = temp4; 
                    	String temp5 = names[j];
                    	names[j] = names[j+1];
                    	names[j+1] = temp5;
                        String temp2 = students[j];
	                    students[j] = students[j+1];
	                    students[j+1] = temp2; 
                }   else if(iqs[j] == iqs[j+1] && heights[j] < heights[j+1] ){  
                	int temp = iqs[j];
                	iqs[j] = iqs[j+1];
                	iqs[j+1] = temp; 
                    	int temp3 = heights[j];
                    	heights[j] = heights[j+1];
                    	heights[j+1] = temp3; 
                    	int temp4 = weights[j];
                    	weights[j] = weights[j+1];
                    	weights[j+1] = temp4; 
                    	String temp5 = names[j];
                    	names[j] = names[j+1];
                    	names[j+1] = temp5;
                        String temp2 = students[j];
	                    students[j] = students[j+1];
	                    students[j+1] = temp2;  
                } else if(iqs[j] == iqs[j+1] && heights[j] == heights[j+1] && weights[j]>weights[j+1] ){  
//                	System.out.println(weights[j] + " : " + weights[j+1]);
                	int temp = iqs[j];
                	iqs[j] = iqs[j+1];
                	iqs[j+1] = temp; 
                    	int temp3 = heights[j];
                    	heights[j] = heights[j+1];
                    	heights[j+1] = temp3; 
                    	int temp4 = weights[j];
                    	weights[j] = weights[j+1];
                    	weights[j+1] = temp4; 
                    	String temp5 = names[j];
                    	names[j] = names[j+1];
                    	names[j+1] = temp5;
                        String temp2 = students[j];
	                    students[j] = students[j+1];
	                    students[j+1] = temp2;  
                }else if(iqs[j] == iqs[j+1] && heights[j] == heights[j+1] && weights[j]==weights[j+1] &&  names[j].compareTo(names[j+1])>0){  
//                	System.out.println(names[j] + " : " + names[j+1]);
                	int temp = iqs[j];
                	iqs[j] = iqs[j+1];
                	iqs[j+1] = temp; 
                    	int temp3 = heights[j];
                    	heights[j] = heights[j+1];
                    	heights[j+1] = temp3; 
                    	int temp4 = weights[j];
                    	weights[j] = weights[j+1];
                    	weights[j+1] = temp4; 
                    	String temp5 = names[j];
                    	names[j] = names[j+1];
                    	names[j+1] = temp5;
                        String temp2 = students[j];
	                    students[j] = students[j+1];
	                    students[j+1] = temp2;  
                }
                 
            }
        }
        
         for(int i = 0; i<N;i++){
            System.out.println(names[i]); 
         }
      
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
	public static void ConsecutiveOnes( ){ 
		
		String str = "01010011";
		int N = str.length();
		int K = 2; 
		if(N==K) {
			System.out.println(N);
			return;
		}
		int[] resLeft = new int[N]; 
		resLeft[0] = 0;
		for(int i = 1; i<N;i++) {
			int j = i;
			while(j>=0 && str.charAt(j) == '1' ) {
				j--;
			}
			resLeft[i] = i-j; 
		}
		int[] resRight = new int[N]; 
		resRight[N-1] = 0;
		for(int i = N-2; i>=0;i--) {
			int j = i;
			while( j<N && str.charAt(j) == '1' ) {
				j++; 
			}
			resRight[i] = j-i; 
		}

		for(int i = 0; i<N;i++) {
			System.out.print(str.charAt(i) + " ");
		}
		System.out.println();
		for(int i = 0; i<N;i++) {
			System.out.print(resLeft[i] + " ");
		}System.out.println();
		for(int i = 0; i<N;i++) {
			System.out.print(resRight[i] + " ");
		}
		int max = 0;

//		for(int i = 0; i<N;i++) {
//			boolean ind = false;
//			int count = 0;
//			int j = i;
//			while(str.charAt(j) == '0') {
//				count++;
//				j++;
//			}
//			if(count == K) {
//				ind = true;
//			}
//			if(ind) {
//				max = Math.max(max, K+resLeft[i]+resRight[i+K-1]);
//			}
//		}
		System.out.println("zsongnsiv  hasdh ");
		for(int i = 0; i<N-K;i++) {
			boolean ind = false;
			int count = 0;
			 for(int j = i; j<(i+K);j++) {   
				if(str.charAt(j) == '0') {
					count++;
				}
			 }
			 if(count == K) {
				 ind = true;
			 }
			 if(ind) {
				 int size = K+resLeft[i-1] + resRight[i+K]; 
				 max = Math.max(max, size);
			 } 
		}
		 

		 System.out.println("Max : " + max);
		
	}
	public static void abandonCity( ){ 
		int[] arr = {1,2,3,4,5};  
		int N = arr.length;
		int K = 9;
		int size = Integer.MAX_VALUE; 
	    int i = 0;
	    int j = 0;  
	    int l = N-1;
	    int r = N-1;
   	 int sum=0;  
   	 int sum2 = 0;
   	while(i<N && j<N && l>0 && r>0){
//          System.out.println("N : " + N + "  K : " + K );
//   		System.out.println(i + " : " + j);
        if(sum<K){
            sum += arr[i];
             i++;
        }else if(sum>K){
             sum -= arr[j];
            j++;
        }
        
        if(sum<K){
            sum2 += arr[l];
             l--;
        }else if(sum>K){
             sum2 -= arr[r];
            r--;
        }
        
         if(sum == K){ 
        		System.out.println(i + " : " + j);
            size = Math.min(size, Math.abs(i-j+1));
            
        } 
         if(sum2 == K) {
        	 size = Math.min(size, Math.abs(l-r+1));
         }
        
    }
    System.out.println(   size);
    
}
	public static void diversity( ){  
//		int[] arr = {1,10,20};   
		int[] arr = {1,2,13,12,15,17}; 
//		1 2 12 13 15 17 
		int N = arr.length;
		int K = 4;
		int size = 1;
        Arrays.sort(arr); 
        int i = 0;
        int j = 0;
        while(i<N && j<N){
            int diff = Math.abs(arr[j]-arr[i]);
            if(diff<=K  ) { 
            	System.out.println(i + " : " + j + " : " + diff );
            	if(i!=j) {
            		System.out.println("inside : " + Math.abs(j-i));
            		size = Math.max(size, Math.abs(i-j+1));
            	}
            	i++; 
            }else {
            	j++;
            }
            
        }
        System.out.println("SIZE : " + size);
        
    }
	 public static void   weightLifting (){ 
		 int[] arr  =  {17, 12, 5, 3, 14, 13, 3, 2};  
		 int N = arr.length;
	        int harry = 0;
	        int john = 0;
	        int hl = 0;
	        int jl = 0;
	            int i = 0; 
	            int j = N-1;
	            harry += arr[i];
	            hl = arr[i];
	            i++;
	            while(i<=j){ 
	                int wt1 = 0; 
	               while(wt1<=hl && i<=j ){ 
//	            	   System.out.println(wt1 + " : " + hl + " : "  + i + " : " + j);
//	            	   System.out.println(arr[j]);
	               wt1 += arr[j];
	               j--;
	               }
	               System.out.println("WT1 : "+wt1);
	               jl = wt1;
	               john += wt1;
	               
	               int wt2 = 0;
	               while(wt2<=jl && i<=j){
	               wt2 += arr[i];
	               i++;
	               }
	               System.out.println("WT2 : "+wt2);
	               hl = wt2;
	               harry += wt2;
	                
	            }
	              
	            System.out.println(harry + " : " + john);
	      }
	 
	public static void  leetcode(){  
		int[] arr = {9,9,9};
		int n = arr.length;
		int num = 1;
		for(int i = n-1; i>=0;i--) {
			
			if(arr[i]<9  ) { 
				if(num>0) {
					arr[i] = arr[i] + num;
					num--;
				}
			}else {
				arr[i-1] = arr[i-1] + 1;
				arr[i] = 0;
			}
		}
		for(int i = 0; i<n;i++) {
			System.out.print(arr[i]);
		}
	}
	public static void  xSubArrays(){  
        // System.out.println(N);
        // System.out.println(K);
        // System.out.println(X);
        // for(int i = 0; i<N;i++){
        //     System.out.println(arr[i]);
        // }
		int N = 7;
		int[] arr = {6 ,1 ,5 ,3 ,2 ,2 ,1};
		int K = 2 ; 
		int X = 1; 
		 
		int count = 0;
        for(int i = 0; i<N-X+1;i++){
        	int max = K;
        	boolean ind = true;
            for(int j = i; j<i+X;j++){
            	System.out.println(arr[j]);
               max = Math.max(max, arr[j]); 
            }
//            System.out.println();
            if(max != K) {
            	System.out.println("max: " + max);
            	ind  = false;
            } 
            if(ind) {
            	System.out.println("Max : "   + max);
            	count++; 
            } 
        }
        System.out.println("COunt : " +count );
	  }
	
	public static void Virus(){
		int[] arr = {0 ,-11, 5, 5 ,-10 ,0 ,50}; 
//		0 0 -11 -10 5 5 50
		int N = arr.length;
		int max = 0; 
		for(int i = 0; i<N;i++) {
			int sum = 0; 
			int max2 = 0;
			for(int j = i; j<N; j++) {
				max2 = Math.max(arr[j], max2); 
				if(arr[j] > 0) {
					sum += arr[j];
				}
				System.out.println("SUM : " + sum  + " Max : " + max2 + " J " + arr[j] );
			}
			max = Math.max(max, sum-max2);
		}
		System.out.println("Max : " + max);
	  }
	public static void moveZeroes( ) {
		int[] nums = {0,1,0,3,12};
//		int[] arr = new int[nums.length];
		int j = 0;
       for(int i = 0; i<nums.length;i++) {
    	   if(nums[i] != 0) {
    		   int temp = nums[i];
    		   j++;
    		   System.out.print(temp + " ");
    		   nums[j] = temp;
    	   } 
       } 
//       for(int i = 0; i<nums.length;i++) {
//    	   System.out.print(nums[i] + " ");
//       }
    }
	public static void removeElement( ) {
		int[] nums = {0,1,2,2,3,0,4,2};
		int val = 2;
		int n = 0;
		ArrayList<Integer> arr = new ArrayList<>(); 
        for(int i = 0; i<nums.length;i++){
            if(nums[i] != val) {
            	arr.add(nums[i]);
            	n++;
            	System.out.println(nums[i] + " : " + arr);
            	nums[n-1] = arr.get(n-1);
//            	System.out.print("nums : " + nums[i]);
            }
        }
        for(int i = 0; i<nums.length;i++) {
        	System.out.print(nums[i]);
        }
        System.out.println();
//        for(int i = 0; i<arr.size();i++) {
//        	nums[i] = arr.get(i);
//        }
        for(int i = 0; i<arr.size();i++) {
        	System.out.print(nums[i] + " ");
        }

    }
	public static int removeDuplicates(int[] nums) {
		int n = nums.length;
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(nums[0]);
		for(int i = 1; i<n;i++) {
			if(arr.get(arr.size()-1) != nums[i]) {
				 arr.add(nums[i]);
			}
		}
       for(int i = 0; i<arr.size();i++) {
    	   System.out.print(i+ " ");
       }
      return 1;
  }
	
	static void segregateEvenOddAndSorted(int arr[], int n) { 
	      Arrays.sort(arr);
	      ArrayList<Integer> odd = new ArrayList<>();
	      ArrayList<Integer> even = new ArrayList<>();
	      for(int i = 0; i<n;i++) {
	    	  if(arr[i] %2 == 0) {
	    		  even.add(arr[i]);
	    	  }else {
	    		  odd.add(arr[i]);
	    	  }
	      } 
	      for(int i = 0; i<even.size();i++) {
	    	  arr[i] = even.get(i);
	      }
	      for(int i = 0; i<odd.size();i++) {
	    	  arr[i+even.size()] = odd.get(i);
	      }
	      
	      for(int I = 0; I < n;I++) {
	    	  System.out.print(arr[I] + " ");
	      }
	    }
	
	static void segregateEvenOdd(int arr[], int n) {
		 
	      Arrays.sort(arr);
	      int i = 0;
	      int j = n-1;
	      while(i<j){ 
	          while(arr[i] %2 == 0 && i<j) {
	        	  i++;
	          }
	          while(arr[j] %2 != 0 && i<j) {
	        	  j--;
	          }
	          if(i<j) {
	        	  int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	                i++;
	                j--;
	          }

	      }
	      for(int I = 0; I < n;I++) {
	    	  System.out.print(arr[I] + " ");
	      }
	    }
	
	public static int AtoB(int A, int B, int x, int y, int count) {
	    if (A < B) {
	        int a = A * x;
	        int b = A * y;

	        if (a < B || b < B) {
	            int option1 = AtoB(a, B, x, y, count + 1);
	            int option2 = AtoB(b, B, x, y, count + 1);
	            
	            if (option1 == -1 && option2 == -1) {
	                return -1; // Neither option works, return -1.
	            } else if (option1 == -1) {
	                return option2; // Option 1 doesn't work, choose option 2.
	            } else if (option2 == -1) {
	                return option1; // Option 2 doesn't work, choose option 1.
	            } else {
	                return Math.min(option1, option2); // Choose the option with fewer operations.
	            }
	        } else {
	            return -1; // Both options lead to numbers larger than B, return -1.
	        }
	    } else if (A == B) {
	        return count; // A is equal to B, return the count of operations.
	    } else {
	        return -1; // A is greater than B, not possible to make them equal, return -1.
	    }
	}
	
	public static int maxOfArrayrecursion(int N, int[] arr ){
		
		if(N == 1) {
			return arr[N-1];
		}else {
			return Math.max(arr[N-1], maxOfArrayrecursion(N-1,arr));
		}
        
         
   }
public static int maxOfArrayrecursionAnother(int l,int r, int[] arr ){
		if(l == r)
			return arr[l];
	 int m = (l+r)/2;
	 int t1 =  maxOfArrayrecursionAnother(l,m,arr);
	 int t2 =  maxOfArrayrecursionAnother(m+1,r,arr);
         
	 return t1>t2 ? t1 : t2;
   }
	
	public static int superDigit(int N){  
        if(N == 0)
        return 0;
         
           return N%10 + superDigit(N/10); 
       
   }
	public static void binary(int N){
	        int bin = 0;
	        while(N>0) {
	        	int x = N%2;
//	        	System.out.println("X : " +  x);
	        	bin = bin * 10 + x;
//	        	System.out.println("Bin 1 : " +  bin);
	        	N = N/2;
//	        	System.out.println("N  : " +  N);
	        }
	        System.out.println(bin);
	   }
	public static int binaryRecursion(int N){
		
		if(N == 0)
			return 0;
		else { 
			return N%2 + 10 * binaryRecursion(N/2);
		}
		 
			  
   }
	
	
	public static int StringLengthRecursion(String str){
	       if(str == "")
	       return 0; 
	       return 1 + StringLengthRecursion(str.substring(1));
	       
	   }
	public static int GCD(int a, int b){ 
//		System.out.println(a + " : " + b);    
        if(a == 0)
        return b;
        if(b == 0)
        return a;
        if(a == b)
        return a;
        if(a ==1 || b == 1)
        return 1;
        
        if(a>b)
        return GCD(a-b,b);
        else
        return GCD(a,b-a);
        
//        if(a == 0)
//        return b;
//        else
//        return GCD(b%a,a);
    }
	
	 public static int ArraySumRecursion(int N, int[] arr){  
//		 System.out.println(N + " : " + arr[N-1]);
//	       if(N == 0)
//	       return 0;
//	       return (arr[N-1]  +  ArraySumRecursion(N-1,arr) );
	      
	       while(N>0) { 
	    	   return (arr[N-1]  +  ArraySumRecursion(N-1,arr) );
	       }
	       return 0;
	    }
	 
	public static int sumOfDigits(int N) { 
		while(N>0) {
			return N%10 + sumOfDigits(N/10);
		}
		return 0;
		
	}
	
	public static int  fzdoo(int x, int y) { 
		if(x>0) {
			 return x%y + fzdoo(x/y,y);
		}
		else return 0;
		
	}
	public static void  count(int x, int y) { 
		if(y != 1) {
			if(x != 1){  
				System.out.println("*"); 
				count(x/2,y);
			}else {
				y = y-1;
				count(1024,y);
			}
		} 
	}
	 public static void  GreaterAgainProduct(int n, int[] arr){
	        int N = n;
	    //   System.out.println(N);
	    //       for(int i = 0; i<N;i++){
	    //           System.out.print(arr[i] + " ");
	    //       }
	    //       System.out.println();
	    
	    Stack<Integer> st = new Stack<>();
	    int[] res = new int[N];
	     st.push(N-1);
	    res[N-1] = -1;
	    
	    for(int i = 2*N-1; i>= 0; i--){
	        while(!st.isEmpty() && arr[st.peek()] <= arr[i%N]){
	            st.pop();
	        }
	       if(i<N) {
	    	   if(!st.isEmpty()){
		            res[i] = arr[st.peek()];
		        }else{
		            res[i] = -1;
		        }
	       }
	        st.push(i%N);
	        
	    } 
 
	    
	     System.out.println(st);
	    int product = 1;
	    for(int i = 0; i<N;i++){ 
	    	System.out.println(res[i]);
	        product = product * res[i];
	        
	    }  
	    System.out.println(product + "asdvib");
	    
	    
	    }
	public static int fun(int n) {
		if(n == 4) 	return 2;
		else  return (2 * fun(n-1)) + 3; 
	}
	public static void fun2(int n) {
		if( n == 0) return; 
		System.out.print(n);
		fun3(n-2);
		System.out.print(n);
	}
	public static void fun3(int n) {
		if( n == 0) return; 
		System.out.print(n);
		fun2(++n);
		System.out.print(n);
	}
	public static void foo(int n, int sum) {
		int k = 0;
		int j = 0;
		if(n == 0) return;
		k = n%10;
		j = n/10;
		sum = sum + k;
		foo(j,sum);
		System.out.print(k + " ");
	}
	public static void sta(int n) {
		if(n>1) {
			sta(n/2);
			sta(n/2);
		}
		System.out.println("*");
	}
	
	
	 
	public static void solution() {
		int[] arr = {1,5,1,3,2};
		int N = arr.length;
		int K = 5;
		int j = 0;
		for(int i = 0; i<N;i++) {
			int sum = 0;
			while(j<N) {
				
			}
		}
		
		 
	}
	  public static void firstUniqueCharacter() {
		  StringBuilder eas = new StringBuilder(); 
		  String str = "racecars";
//		  String str = "aabbccdd";
		   String x = "";
		  HashMap<Character,Integer> uni = new HashMap<>();
		  for(int i = 0; i<str.length();i++) {
			  Character ch = str.charAt(i);
			  int fr = uni.getOrDefault(ch, 0);
			  uni.put(ch, fr+1); 
				
		  }
		  for(int i = 0;i<str.length();i++) { 
			  if(uni.get(str.charAt(i)) == 1) { 
			      x += str.charAt(i);
				  break;
			  }
		  }
		  
		  if(x.length()>0){
		      System.out.println(x);
		  }else{ 
		   System.out.println("Not Found");   
		  }
		   
	  }
	  
	  public static void missingVowel() { 
		  String str = "nature";
		  int n = str.length();
		  String str1 = "aeiou";
		  int m = str1.length();
		  StringBuilder sb = new StringBuilder(); 
		  HashMap<Character, Integer>  alph = new HashMap<>();
		  HashMap<Character,Integer>  vow = new HashMap<>();
		  for(int i = 0; i<n;i++) { 
			  alph.put( str.charAt(i),i);
		  }
		  for(int i = 0; i<m;i++) {
			  vow.put(str1.charAt(i),1);
		  }
		  System.out.println(alph);
		  System.out.println(vow);
		  
		  for(int i = 0; i<str1.length();i++) {
//			  System.out.println(str1.charAt(i));
			  if(alph.containsKey(str1.charAt(i))) {
				  System.out.println(str1.charAt(i) + " Yes");
			  }else {
				  System.out.println(str1.charAt(i) + " No");  
				  sb.append(str1.charAt(i));
			  }
		  }
		  if(sb.toString().equals("")) {
			  sb.append("-1");
		  }
		  System.out.println(sb);
	  }
	  public static void partyPlanning() { 
		  int[] arr1 = {1,2,2,3,4,5,6,66,7};
		  int[] arr2 = {1,2,3,4,5,5,6,6,66,6,2,3,4,5,6,2,3,4,5,6,2,22,3,4,5,6,7};
//		  int[] arr1 = {1,2,3};
//		  int[] arr2 = {1,2,3};
		  int n = arr1.length;
		  int m = arr2.length;
		  HashMap<Integer,Integer> plan1 = new HashMap<>();
		  HashMap<Integer,Integer> plan2 = new HashMap<>();
		  
		  for(int i = 0;i<n;i++) { 
			  plan1.put(arr1[i], 1 );
		  }
		  for(int i = 0;i<m;i++) { 
			  plan2.put(arr2[i], 1 );
		  }
		  System.out.println(plan1);
		  System.out.println(plan2);
		  
		  if(plan1.size() != plan2.size()) {
			  System.out.println("NO");
			  return;
		  }
		  
		  boolean flag = true ; 
		  
		  for(Map.Entry m1 : plan1.entrySet()) {
			  if(!plan2.containsKey(m1.getKey())) {
				  flag = false;
			  }
		  }
		  for(Map.Entry m2 : plan2.entrySet()) {
			  if(!plan1.containsKey(m2.getKey())) {
				  flag = false;
			  }
		  }
		  
		
		  
		  if(flag) {
			  System.out.println("Yes");
		  }else {
			  System.out.println("No");
		  }
		  
	  }
	  public static void mapSymbolsSum() {  
		  String str = "!@#$";
		  int n = str.length();
		  HashMap<Character,Integer> symbols = new HashMap<>();
		  String str2 = "!@#$%^&*";
		  for(int i = 0; i<str2.length();i++) {
			  symbols.put(str2.charAt(i),i+1);
		  }
		  System.out.println(symbols);
		  int sum = 0;
		  for(int i =0;i<str.length();i++) {
			  sum += symbols.get(str.charAt(i));
		  }
		  System.out.println(sum);
		  
	  }
	  public static void reversemod3() {  
		  String str  = "abcdefghijklmnopqrstuvwxyza"; 
		  StringBuilder sb = new StringBuilder();
 		  for(int i = 1;i<str.length();i+=3) {
			  sb.append(str.charAt(i+1));
			  sb.append(str.charAt(i));
			  sb.append(str.charAt(i-1)); 
		  }
 		  
 		  System.out.println(sb.toString());
	  } 
	 public static HashMap OccurencesOfTheWord(String str) {
   	   
   	   HashMap<Character,Integer> occ = new HashMap<>();
   	   
   	   for(int i = 0; i<str.length();i++){
   	   Character ch = str.charAt(i);
   	   int freq = occ.getOrDefault(ch,0);
   	   freq++;
   	   occ.put(ch, freq);
   	   }
   	   System.out.println(occ);
   	   int a = 0;
   	   int b = 0;
   	   int c = 0;
   	   for(Map.Entry m : occ.entrySet()){   
   	     a = occ.get('p');
   	     b = occ.get('e');
   	     c = occ.get('n');
   	   }
   	   if(a<b) {
   		   if(a<c) {
   			   System.out.println(a);
   		   }else {
   			   System.out.println(c);
   		   }
   	   }else {
   		   if(b<c) {
       		   System.out.println(b);
       	   }else {
       		   System.out.println(c);
       	   }
   	   }
		  System.out.println("A"+a+"B"+b+"C"+c); 
		  return occ;
   }
	public static void bagOfChars(){ 
		int n = 5;
		String bag = "aabbc";
		int m = 4; 
		String A = "abcd";
			   
		HashMap<Character,Integer> bagofch = new  HashMap<>();
		for(int i = 0;i<n;i++) {
			bagofch.put(bag.charAt(i), 1);
		}
		System.out.println(bagofch);
		boolean flag = true;
		for(int i = 0;i<m;i++) {
			System.out.println(bagofch.containsKey(A.charAt(i)));

			if(!bagofch.containsKey(A.charAt(i))){
				flag = false;
			}
		}
		if(flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
		public static void charactersofArray(){ 
			String str = "!]!~]~";
			int n = str.length();
		    HashMap<Character,Integer> array = new  HashMap<>();
		    array.put('!', 3);
		    array.put(']', 6);
		    array.put('~', 9); 
		    String str2 = "";
		    int sum = 0;
		    
		    for(int i = 0; i<n;i++) {
//		    	str2 += array.get(str.charAt(i));
		    	sum +=  array.get(str.charAt(i));
		    }
		    System.out.println(sum);
		    
		  }
	
    
	 public static void namefreq() {
		 String Name = "Masai";
		 int N = Name.length();
		 HashMap<Character, Integer> name = new HashMap<>();
		 
		 for(int i = 0; i<N;i++) {
			 Character ch = Name.charAt(i);
			 Integer value = name.get(ch);
			 if(value == null) {
				 name.put(ch,1);
			 }else {
				 name.put(ch, value+1);
				 }
					 
		 }
		 System.out.println(name);
        
	 }
	 
    public static void freqHashMp() {
    	String S = "vinaygoud";
    	HashMap<Character, Integer> name = new HashMap<>();
		 
		 for(int i = 0; i<S.length();i++) {
			 Character ch = S.charAt(i);
			 Integer value = name.get(ch);
			 if(value == null) {
				 name.put(ch,1);
			 }else {
				 name.put(ch,value+1);
				 }
					 
		 }
		 String uni = "";
		 for(Map.Entry m : name.entrySet()){   
        	    Integer n = (Integer) m.getValue();
        	   if(n>1) {
        		   System.out.println("NO");
        		   break;
        	   }else { 
        		   uni = "UNIQUE";
        		   continue;
        	   }
        	   } 
		 System.out.println(uni);
    }
//    String[] classNames =  {"Class-V", "Class-VI", "Class-VII", "Class-VIII"};
//    int[] values = {1, 2, 3, 4};
//    CreateHashMap();

    public static HashMap CreateHashMap(String [] classNames, int[] values) {
    	
      HashMap<String, Integer> classnames = new HashMap<>();
      for(int i = 0; i<classNames.length;i++) {
    	  classnames.put(classNames[i], values[i]);
      }
      
         return classnames;
    }
    public static void MergeHashMap() { 
    	 HashMap<Character, Integer> map1 = new HashMap<>();
    	    HashMap<Character, Integer> map2 = new HashMap<>();

    	   
    	    map1.put('a',100);
    	    map1.put('b',200);
    	    map1.put('c',300); 
    	    map2.put('a',300); 
    	    map2.put('b',200); 
    	    map2.put('d',400);  
    	    	 HashMap<Character, Integer> map3 = new HashMap<>();
    	    	 for(Map.Entry<Character, Integer> m1 : map1.entrySet()) { 
    	 	    	Character key = (Character) m1.getKey();
    	 	    	int value = (Integer) m1.getValue(); 
    	 	    	map3.put(key, map3.getOrDefault(key, 0)+value); 
    	 	    }
    	    	 for(Map.Entry<Character, Integer> m2 : map2.entrySet()) { 
    	  	    	Character key = (Character) m2.getKey();
    	  	    	int value = (Integer) m2.getValue(); 
    	 	    	map3.put(key, map3.getOrDefault(key, 0)+value); 
    	  	    	 
    	  	    } 
    	    
    	    System.out.println("MAP3 : " + map3);
    
    }
    public static HashMap  merge(HashMap<Character, Integer> map1, HashMap<Character, Integer> map2) {
    	  
   	 HashMap<Character, Integer> map3 = new HashMap<>();
   	 for(Map.Entry<Character, Integer> m1 : map1.entrySet()) { 
	    	Character key = (Character) m1.getKey();
	    	int value = (Integer) m1.getValue();
	    	System.out.println("key " + key + " " + " value " +  value);
	    	System.out.println("map1.getOrDefault(key, 0) : " + map1.getOrDefault(key, 0));
	    	map3.put(key, map3.getOrDefault(key, 0)+value); 
	    }
   	 for(Map.Entry<Character, Integer> m2 : map2.entrySet()) { 
 	    	Character key = (Character) m2.getKey();
 	    	int value = (Integer) m2.getValue();
 	    	System.out.println("key2 " + key + " " + " value2 " +  value);
	    	System.out.println("map2.getOrDefault(key, 0) : " + map2.getOrDefault(key, 0));
	    	map3.put(key, map3.getOrDefault(key, 0)+value); 
 	    	 
 	    } 
   	 
   	 return map3;
   	
   }
    public static void appearOnce() {
    		int[] arr = {3, 5, 3, 3, 8, 5, 6} ;
    		int N = arr.length;
    		 HashMap<Integer,Integer> map = new HashMap<>();
    		 for(int i = 0; i<N;i++) {
    			 int x = arr[i];
    			 int count = 0;
    			 for(int j = 0;j<N;j++) {
    				 if(x == arr[j]) {
    					 count++;
    					 map.put(x, count);
    				 }
    			 }
    			 
    		 }
    		 System.out.println(map);
    		 int sum = 0;
    		 for(Map.Entry m : map.entrySet()){  
  			   int a = (int) m.getKey();
//         	    System.out.println(m.getValue()); 
         	     
         	 if((int)m.getValue() == 1) {
//  		        System.out.println(m.getKey());
  		       sum += a;
  		       
  		      }
         	   }
    		 System.out.println(sum); 
    }
	 public static void anagram() {
		
		 String str1 = "abcd";
		 String str2 = "dcab"; 
		 HashMap<Character,Integer> strings1 = new HashMap<>();
		 HashMap<Character,Integer> strings2 = new HashMap<>();
		 for(int i = 0;i<str1.length();i++){
			 Character ch = str1.charAt(i);
             Integer val = strings1.getOrDefault(ch,0);
             val++;
             strings1.put(ch, val);
		 }
		 for(int i = 0;i<str2.length();i++){  
			 Character ch = str2.charAt(i);
             Integer val = strings2.getOrDefault(ch,0);
             val++;
             strings2.put(ch, val);
         
		 }
		 System.out.println(str1);
		 System.out.println(str2);
		 System.out.println(str1.equals(str2));	
	 }

	 public static void elements() {
		 int[] arr = {0 ,2 ,0 ,6, 9};
		 int N = arr.length; 
		 int max = 0;
		 HashMap<Integer,Integer> elements = new HashMap<>();
		   for(int i = 0;i<N;i++){
		       int count = 0;
		       int x = arr[i];
		       for(int j = 0; j<N;j++) {
		    	   if(x == arr[j]){ 
			           count++;
			           if(count>max) {
			        	   max = count;
			           }
			           elements.put(x,count);
			       }else{
			    	   elements.put(x,count);
			       }
		       }
		   }
		   System.out.println("souebcfouhefe : " + elements);

//		    for(Entry<Integer, Integer> entry: elements.entrySet()) {
//
//		      if(entry.getValue() == max) {
//		        System.out.println(entry.getKey());
//		        break;
//		      }
//		    }
		   for(Map.Entry m : elements.entrySet()){  
			   int a = (int) m.getValue();
       	    System.out.println(m.getValue()); 
       	     
       	 if(a == max) {
		        System.out.println(m.getKey());
		        break;
		      }
       	   }
		   
	 }


    public static void freqHashMap() { 
    	int N = 30;
    	HashMap<Integer, Character> alphabets = new HashMap<Integer, Character >();
        alphabets.put(1+N-1,'a');
        alphabets.put(null,null);
        alphabets.put(2+N-1,'b');
        alphabets.put(3+N-1,'c');
        alphabets.put(4+N-1,'d');
        alphabets.put(5+N-1,'e');
        alphabets.put(6+N-1,'f');
        alphabets.put(7+N-1,'g');
        alphabets.put(8+N-1,'h');
        alphabets.put(9+N-1,'i');
        alphabets.put(10+N-1,'j');
        alphabets.put(11+N-1,'k');
        alphabets.put(12+N-1,'l');
        alphabets.put(13+N-1,'m');
        alphabets.put(14+N-1,'n');
        alphabets.put(15+N-1,'o');
        alphabets.put(16+N-1,'p');
        alphabets.put(17+N-1,'q');
        alphabets.put(18+N-1,'r');
        alphabets.put(19+N-1,'s');
        alphabets.put(20+N-1,'t');
        alphabets.put(21+N-1,'u');
        alphabets.put(22+N-1,'v');
        alphabets.put(23+N-1,'w');
        alphabets.put(24+N-1,'x');
        alphabets.put(25+N-1,'y');
        alphabets.put(26+N-1,'z');
    	int sum = 0;
    	HashMap<Character, Integer> alphabets1 = new HashMap<>();
        alphabets1.put('a',N);
        alphabets1.put('b', N+1);
        alphabets1.put('c', N+2);
        alphabets1.put('d', N+3);
        alphabets1.put('e', N+4);
        alphabets1.put('f', N+5);
        alphabets1.put( 'g', N+6);
        alphabets1.put( 'h', N+7);
        alphabets1.put('i', N+8);
        alphabets1.put('j', N+9);
        alphabets1.put('k', N+10);
        alphabets1.put('l', N+11);
        alphabets1.put('m', N+12);
        alphabets1.put('n', N+13);
        alphabets1.put('o', N+14);
        alphabets1.put('p', N+15);
        alphabets1.put('q', N+16);
        alphabets1.put('r', N+17);
        alphabets1.put('s', N+18);
        alphabets1.put('t', N+19);
        alphabets1.put('u', N+20);
        alphabets1.put('v', N+21);
        alphabets1.put('w', N+22);
        alphabets1.put('x', N+23);
        alphabets1.put('y', N+24);
        alphabets1.put('z', N+25);
  String str = "abc";
      for(int j =0; j<str.length();j++) { 
    	  sum += alphabets1.get(str.charAt(j)); 
      }    
      System.out.println("SUM : " + sum);
        for(int i = 1; i<=alphabets.size(); i++){
            System.out.println(alphabets.get(i+N-1) + " - " + (N+i) );
             
        }
    }
        public static void freq() {
    	String name = "vinayagoud";
    	for(int i = 0; i<name.length();i++) {
    		char c = name.charAt(i);
    		int count = 0;

        	for(int j = 0; j<name.length();j++) {
        		if(name.charAt(j) == c) {
        			count++;
        		}
        	
        	}
        	System.out.println("name.charAt(i) : " + name.charAt(i) + " count : " + count);	
    	count = 0;
    	}
    }
    public static void other() {
    	System.out.println("math : " + Math.toRadians(15));
    	 HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
//    	 HashMap<Integer,String> map=new HashMap<>();//Creating HashMap    
    	   map.put(1,"Mango");  //Put elements in Map  
    	   map.put(4,"Grapes");
    	   map.put(2,"Apple");    
    	   map.put(3,"Banana");
    	   map.put(5,"Orange");
    	   map.put(6, "Pomo");
    	   System.out.println("map.size() : " + map.size());
    	   System.out.println("1 " + map);
    	   map.remove(7);
    	   System.out.println("2 " + map);
    	   map.put(6, "Pomo");
    	   System.out.println("3 " +map);
    	   System.out.println("Iterating Hashmap...");  
    	   for(Integer i : map.keySet()) {
    	    System.out.println("Key " + i  +  " - Value " + map.get(i));    
    	   } 
    		for(Map.Entry m : map.entrySet()){   
        	    System.out.println(m.getKey()+"-"+m.getValue());    
        	   } 
    	   System.out.println(map.containsKey(5)); 
    	   System.out.println(map.getOrDefault(7, "No Fruit"));
    	   
    }
		
		
	 public static String swapcases(String str){
		 String str2 = "";
		 
		    for(int i = 0; i<str.length();i++){
		    	char c = str.charAt(i);

		      if(Character.isLowerCase(c)){
		        
		        str2 += Character.toUpperCase(c);
		      }else if(Character.isUpperCase(c)) {
		    	  str2 +=  Character.toLowerCase(c);
			          
		      }else {
		    	  str2 += c;
		      }
		    }

		    return str2;
		  
	 }
	


	 public static int ArrayLength(int[] x) {
		  return x.length;
		 }
	 public static int Average(int[] x) {
		 int sum = 0;
			 for(int i = 0; i<x.length;i++) {
				 sum += x[i];
			 }
		 
		 	return sum;
		 }
	  
 
	 
	static void StarPattern() {
	int n = 5;
		for(int i=1;i<=n;i++)
        {
			for(int j=0;j<n-i;j++)
			                {
			                        System.out.print(" ");
			                }
			
			        for(int j=0;j<i;j++)
			                {
			                        System.out.print("*");
			                }
			              System.out.println();
			        }             
}
	
		

		public static int modifyStringwithIndices (String[] s ) { 
			int total = 0;
			for(String sa : s) {
				if(sa.length()%2 == 0) {
					for(char c : sa.toCharArray()) {
						total += (int) c;
					}
				}
			}
			
			return total;
	}
	
	static void SOJvnsoknv() {
		String i = "sdfghjhgfdsdfgh";
		System.out.println(i.contains("ghjfd"));
		
		
	
		
		
	} 
	static void addingmatrices() {
		int [][] a =  {{1,2,3},{4,5,6}};
		int [][] b =  {{8,651,61},{45,555,566}};
//		int [][] c =  {{1,1,1},{1,1,1}};
		int [][] c =  new int[2][3];
		
		for(int i = 0; i<a.length;i++) {
			System.out.println();
			for(int j = 0; j<a[i].length ;j++) {
				System.out.print(a[i][j] + " ");
				c[i][j] = a[i][j] + b[i][j];
				}

	}
		for(int i = 0; i<a.length;i++) {
			System.out.println();
			for(int j = 0; j<a[i].length ;j++) {
//				System.out.print("C ["+i+"] [" + j +"] : "  + c[i][j] + " "); 
				System.out.print(c[i][j] + " "); 
				}
	}
	}
	public static void reverse() {
		String word = "Vinay";
		String word2 = "";
		System.out.println("Lenght : " + word.length());
		for(int i=word.length()-1; i>=0;i--) {
			word2 += word.charAt(i);
		}
	System.out.println("Word : " + word.toUpperCase());
	System.out.println("Reversed Word : " + word2.toUpperCase());
	StringBuilder sb = new StringBuilder(word); 
	sb.append(" kjsbvjbsv");
	System.out.println("sb ; " + sb);
	}
	
	public static void palindrome(String word) {
		String word2 = word;
		StringBuilder sb  = new StringBuilder(word2);
		sb.reverse();
		String rev = sb.toString();
			if(rev.equals(word2)) {
				System.out.println("Palindrome");
			}else {
				System.out.println("Not a palindrome");
			}		
	 	}
	
	public static void sum() { 
        int number1 = 24; 
        int number2 = 35;

    	int num3 = add(number1,number2);
        int num4 = sub(number1,number2);
        int num5 = multiply(number1,number2);
        float num6 = divide(number1,number2);
        System.out.println("Total : " + num3);
        System.out.println("Difference : " + num4);
        System.out.println("Product : " + num5);
        System.out.println("In Decimals : " + num6);
        System.out.println("Random : " + Math.random());
	}
	public static void stringmthd() {
		String sent = "I like Java";
		String sent2 = "I like Java2";
		String sent3 = sent.concat(sent2) + " 3";
		System.out.println("Sent 3 : "+ sent3);
		System.out.println(sent.contains("like"));
	}
	private static void largest() {

    	int a1[] = {1, 8, 4, 9,88,66,548,241,654654531,65,21,89,9999,15474};		
		Arrays.sort(a1);
		System.out.println("Largest : " + a1[a1.length-1]);
	}
	public static void swapnumbers( int number1, int number2 ) {

		System.out.println("Before Swapping : Num1 : " + number1);
		System.out.println("Before Swapping : Num2 : " + number2);
		int temp = number1;
		number1 = number2;
		number2 = temp;
		System.out.println("After Swapping : Num1 : " + number1);
		System.out.println("After Swapping : Num2 : " + number2);
	}
	public static void swapnumbers( String str1, String str2) {

		System.out.println("Before Swapping : Num1 : " + str1);
		System.out.println("Before Swapping : Num2 : " + str2);
		String temp = str1;
		str1= str2;
		str2 = temp;
		System.out.println("After Swapping : Num1 : " + str1);
		System.out.println("After Swapping : Num2 : " + str2);
	}
	public static void canthepersonvote(int age, String citizenship) {
		if(age>=18 && citizenship == "Indian") {
			System.out.println("Person can vote");
		}else {
			System.out.println("Person can't vote");
		}
	}
	
	public static void arrayppts() {
        int[] marks = {21, 25, 290};
        String[] names = { "Vinay" , "Shreyas", "Akhil"};
        System.out.println("Marks : " + marks[1]);
        System.out.println("Names : " + names[1]);
        System.out.println("Marks : " + marks);
        System.out.println("Marks : " + Arrays.toString(marks));
        System.out.println("Names : " + names);
        System.out.println("Marks : " + Arrays.toString(names));	
        
       
	}
	
	public static int findnum(int[] marks) {
		 int tofind = 21;
	        for(int j = 0; j<marks.length; j++) {
	        	if( marks[j] == tofind){ 
	        		return j;
	        	}
	        }
	        return -1;
	}

	public static int add(int num1, int num2) {
		int num3 = num1 + num2;
		return num3;
	}
	public static int sub(int num1, int num2) {
		int num3 = num1 - num2;
		return num3;
	}
	public static int multiply(int num1, int num2) {
		int num3 = num1 * num2;
		return num3;
	}
	public static float divide(float num1, float num2) {
		float num3 = num1 / num2;
		return  num3;
	}
	
	public static void triangle() { 
        int Side1 = 1; 
        int Side2 = 2; 
        int Side3 = 3;
        if (Side1 == Side2 && Side2 == Side3) {
        	System.out.println("Equilateral Triangle");
        }else if (Side1 == Side2 || Side2 == Side3 || Side1 == Side3) {
        	System.out.println("Isosceles Triangle");
        }else if (Side1 != Side2 && Side2!= Side3) {
        	System.out.println("Scalene Triangle");
        }
	}

	 public static void pyramid(int size) {
		 for(int i = 0; i<size ; i++) {

			 	for(int j = 0; j<= i; j++) {
				 System.out.print("*");				 		 
			 	}
				 System.out.println();
		}		 
	 }
	 
	 public static void invertedpyramid(int size) {
		 for(int i = size-1; i>=0 ; i--) {

			 	for(int j = 0; j<= i; j++) {
				 System.out.print("*");				 		 
			 	}
				 System.out.println();
		}
		 
	 }
	 public static String change_char(String s) {
		    String Str = s;
		    char a = Str.charAt(0);
		    String returnstring = null;
		    for(int i = 1; i<=Str.length(); i++) {
		    	if(Str.charAt(i-1)==a) {
		    		String newstr = Str.substring(1);
		    		char b = '$';
		    		 returnstring = newstr.replace(a, b);
		    	}
		    }
			return a+returnstring;    
		}
	 public static void test() {
		 char ch1 = 'S';

	       char ch2 = 'C';

	       String s = ch1 + ch2 + "ALER";      

	       System.out.println(s);

	   }
	 
	 public static void LCM() { 
	        int Num1 = 21; 
	        int Num2 = 44;
      
	        int max = 0;
	        if(Num1 > Num2) {
	        	max = Num1;
	        }else {
	        	max = Num2;
	        } 
	        int i = max;
	        while(i >= max) { 
	        	if(i%Num1 == 0 && i%Num2 == 0) { 
	        		System.out.println("LCM : " + i);
		        	break;
		        	}
	        	i++;
	        }
	 }
	 
	 public static void HCF() {
		 	int Num1 = 21; 
	        int Num2 = 44;	
	        int hcf = 0;
	        for (int i = 1; i<= Num1|| i<= Num2; i++) {
	        	if(Num1%i == 0 && Num2%i == 0) {
	        		hcf = i;
	        	}
	        }
	        System.out.println("HCF is : " + hcf);
	        }
	 public static void a3b2() {
		 String S = "a3b2";
		 for(int i =0; i<S.length();i++) {
			 if(i%2  != 0) {
				 int number = Integer.parseInt("" + S.charAt(i));
				 for(int j = 0; j<number;j++) {
					 System.out.print(S.charAt(i-1));
				 }
			 }
		 }
	 
	 }
	 
	 public static boolean isPrime(int num){ 
		 boolean flag = true;
		    if(num==1){
		        flag = false;
		    }else{
			    for(int i = 2; i<=num/2;i++){
			        if(num%i == 0){
			        	flag = false;
			        }
			    } 
		    }
		    return flag; 
	 }
	 public static void criticalminmax() { 
//		 2
//		 3 1
//		 7
//		 5 3 1 2 5 1 2
//		 9
//		 1 3 2 2 3 2 2 2 7
		 
//		 A critical point in an array is defined as either a local maxima or a local minima.A element is a local maxima 
//		 if the current element has a value strictly greater than the previous element and the next element.
//		 A element is a local minima
//		 if the current element has a value strictly smaller than the previous element and the next element.
//		 Note that a element can only be a local maxima/minima if there exists both a previous element and a next element.
//		 Given an integer array of size N, you have to print minDistance and maxDistance,
//		 where  minDistance is the minimum distance between any two distinct critical points and maxDistance is the maximum distance between any
//		 two distinct critical points. 
//		 If there are fewer than two critical points, minDistance = -1 and maxDistance = -1. 
		 
//		 For the first test case There are no critical points in [3,1]. 
//		 For the second test case
//		 There are three critical points:<ul>[5,3,1,2,5,1,2]: The third element is a local minima because 1 is less than 3 and 2
//		 .[5,3,1,2,5,1,2]: The fifth element is a local maxima because 5 is greater than 2 and 1.[5,3,1,2,5,1,2]: 
//		 The sixth element is a local minima because 1 is less than 5 and 2.The minimum distance is between the fifth and the sixth element. 
//		 minDistance = 6 - 5 = 1.The maximum distance is between the third and the sixth element. maxDistance = 6 - 3 = 3.
//		For the third test caseThere are two critical points:<ul>[1,3,2,2,3,2,2,2,7]: 
//		The second element is a local maxima because 3 is greater than 1 and 2.[1,3,2,2,3,2,2,2,7]: 
//		The fifth element is a local maxima because 3 is greater than 2 and 2.Both the minimum and maximum distances are between the second and
//		 the fifth element.Thus, minDistance and maxDistance is 5 - 2 = 3.Note that the last element is not considered a local maxima because it 
//		does not have a next element.

	 }
//	 * * * * * 
//	 * * * *   
//	 * * *     
//	 * *        
//	 *          
	   

	 public static void moseven() {
		int[][] mat = {	{1, 2,  3,  4},
						{5, 6,  7,  8},
						{9, 10, 11, 12},
						{13,14, 15, 16}}; 
		 
//		 int[][] mat = {{1, 2,  3},
//						{5, 6,  7},
//						{9, 10, 11},};
		 
//		 int[][] mat = {{1, 2,  3},
//						{5, 6,  7},
//						{9, 10, 11},};
		 
		
		int rows = mat.length;
		int cols = mat[0].length;
		int k = 10;
		int i1 = 0;
		int j1 = 0;
		for(int i = 0; i<rows;i++) {
			for(int j = 0; j<cols;j++) {
				if(mat[i][j] == k) {
					  i1 = i;
					  j1 = j;
				}				
			}
		}
		
		for(int i = 0; i<rows;i++) {
			for(int j = 0; j<cols;j++) {
				if((i-j) == (i1-j1)) {  
					System.out.print(mat[i][j] + " ");
				}
			}
		}
		System.out.println();
		for(int i = 0; i<rows;i++) {
			for(int j = 0; j<cols;j++) {
				if((i+j) == (i1+j1)) {  
					System.out.print(mat[i][j] + " ");
				}
			}
		}
		
		
		
		
		
		
		}
	 public static void unitsConsumed(){
		 	int n = 230; 
		    int sum = 0;
//		    int[] range = {50,100,150}; 
//		    int[] amount = {3,5,10};
//		    int bill = n;
		    int fix = 80; 
		    
		    int remaining = n-fix; 
		    System.out.println(remaining);
		    if(remaining>=150) {
		    	remaining = remaining-150;
		    	sum = sum +50;
		    	 System.out.println("N : " +n + " Sum : " + sum + " remaining : " + remaining);
		    	  System.out.println("------------");
		    } else {
		    	int un = remaining/3;
		    	sum = sum + un;
		    }

		    System.out.println("remaining 1: " + remaining + " " + sum);
		    if(remaining>=500) {
		    	remaining = remaining-500;
		    	sum = sum +100; 
		    	
		    } else { 
		    	int un = remaining/5;
		    	sum = sum + un;
		    	remaining = remaining-un*5;
		    }
		    System.out.println("remaining 2: " + remaining + " " + sum);
		    if(remaining>0) {
		    		sum = sum+ remaining/10;
			       remaining = remaining-500;
		    }
		      
		       System.out.println("N : " +n + " Sum : " + sum + " remaining : " + remaining +" sum2 "  ) ; 
		 
		    
		     
	 }
	 
	  public static void check420(){
		    int N =142056789;
//		    String str =  "abcdefghijk";  
		    String str =  String.valueOf(N);
		    str.substring(0,4);
		    StringBuilder sb = new StringBuilder(str);  
		    boolean flag = false;
		   for(int i =0; i<str.length()-2;i++) { 
			   if(str.substring(i, i+3).equals("420")) {
				   flag = true;
			   }
		   }
		   
		   if(flag) {
			   System.out.println("Caught");
		   }else {
			   System.out.println("Escaped");
		   }
		   
		   String str1 = "AbC";
		    StringBuilder sb1 = new StringBuilder(str1);
		    sb.replace(0, 1, "a");
		    sb.replace(1, 2, "B");
		    sb.setCharAt(2, 'Y');
		    sb.insert(0, 'Z');
		    sb.append('A');
		    sb.deleteCharAt(2);
		    System.out.println("SB : " + sb);
		    
		    
		    
		    
//		    int count = 0;
//		    for(int i= 0; i<N;i++){
//		       if(N % 1000 == 420){
//		          count++; 
//		       }else{
//		           N /=10;
//		       }
//		    }
//		     
//		    if(count>0){
//		        System.out.println("Caught");
//		    }else{
//		        System.out.println("Escaped");
//		    } 
		  }

	  public static void maximumOccuringElement(){
		  	 int [] arr = {0,2,0,6,9,6,6,7};
		  	 int N = arr.length;
			 int max = 0;
			 HashMap<Integer,Integer> elements = new HashMap<>(); 
			   for(int i = 0;i<N;i++){
			       int count = 0;
			       int x = arr[i];
			       for(int j = 0; j<N;j++) {
			    	   if(x == arr[j]){ 
				           count++;
				           if(count>max) {
				        	   max = count;
				           }
				           elements.put(x,count);
				       }else{
				    	   elements.put(x,count);
				       }
			       }
			   }
			  for(Map.Entry m : elements.entrySet()){  
				   int a = (int) m.getValue(); 
	       	     
	       	 if(a == max) {
			        System.out.println(m.getKey());
			        break;
			      }
	       	   }
			   

	  }
	  public static boolean detectPalindrome(String s){ 
	      boolean flag = true;
	    for(int i = 0; i<s.length()/2;i++){ 
	       
	       if(! (s.charAt(i) == (s.charAt(s.length()-1-i)))){
	           flag = false;
	           break;
	       }
	    }
	    return flag; 
	  }
	  
	  public static void allSubStrings(){
		  String s = "Vinay";
		  int n = s.length();
		  
		  for(int i = 0; i<n;i++) {
			  for(int j = i+1;j<n+1;j++) {
				  System.out.println(s.substring(i,j));
			  }
		  } 
	}
	  public static void subStrUnderCond(){
		  String s = "abcab";
	      int count = 0;
	      int n = s.length();
	      for(int i = 0; i<n;i++) {
				  for(int j = i+1;j<n+1;j++) { 
					  String x = s.substring(i,j);
				      int x1 = x.length();
				      
//				      for(int  z = 0; z<x1;z++){
				          if(x.charAt(0) == x.charAt(x1-1)){
				              count++;
//				          }
				      }
				  }
			  }
			System.out.println(count);   
	  }
	  public static void masaiPalindromicSubstring() {
		  String str = "aaaaa";
		  int N = str.length();
		  int max = 0;
		  for(int i = 0; i<N;i++) {
			  for(int j = i+1; j<=N;j++) {
//				  System.out.println(str.substring(i,j));
				  String str2 = str.substring(i,j);
//				 System.out.println(!detectPalindrome(str2));
				  if(detectPalindrome(str2)){ 
//					  System.out.println(str2);
					  if(str2.length()>max ) {
						  System.out.println(str2);
						  max = str2.length();
					  }
				  } 
			  }
		  }
		  System.out.println(max);
	  }
	  
	  public static void swapZeroAndOne() {
		  int[] arr = {0,1,0,1,0,0,1,1,0,0,0,1,0,1,1};
		  int a = 0; 
		  int b = arr.length-1;
		  int[] arr2 = {1,3,5,7,9};
		  int[] arr3 = {2,4,6,8,10}; 
		  int[] arr4 = new int[arr2.length + arr3.length];
		  int x = 0;
		  int y = 0;
		  int m = 0; 
		  while(x < arr2.length && y < arr3.length) { 
			  if(arr2[x]<arr3[y]) {
				  arr4[m] = arr2[x];
				  x++;
				  m++;
			  }else{
//			  }else  if(arr2[x]>arr3[y]) {
				  arr4[m] = arr3[y];
				  y++;
				  m++;
			  }
		 
			  
			  
		  }
		  
		  for(int i = 0; i<arr4.length;i++) {
			  System.out.println("Arr4(" + i + ") : " + arr4[i]+" ");
		  }
		  for(int i = 0; i<arr.length;i++) {
			  System.out.print(arr[i]+" ");
		  }
		   
		  while(a<b){
			  while(arr[a] == 0)
				  a++;
			  while(arr[b] == 1)
				  b--;
			  if(a<b) {
				  arr[a] = 0;
				  arr[b] = 1;
				  a++;b--;
			  }
		  }
		  System.out.println();
		  for(int i = 0; i<arr.length;i++) {
			  System.out.print(arr[i] + " ");
		  } 
		  
		  System.out.println();
		  int[] arr6 = {1,1,2,2,2,2,3,4,4,4,4,5};
		  for(int i1 = 0; i1<arr6.length;i1++) { 
			  System.out.print(arr6[i1] +  " ");
		  }  
		  System.out.println();
		  int j = 0;
		   for(int i = 0; i<arr6.length-1;i++) {
			   if(arr6[i] != arr6[i+1]) {
				   arr6[j] = arr6[i];
				   j++;
			   }
		   }
		   System.out.println( arr6[j]  + " -:- " +arr6[arr6.length-1] );
		   arr6[j] = arr6[arr6.length-1];
		   
		  System.out.println();
		  for(int i1 = 0; i1<arr6.length;i1++) {  
			  System.out.print(arr6[i1]+  " ");
		  }
		  
		  
	  }
	  
	  public static void applyBasicMaths(){
		  int A[] = {14 ,7 ,8 ,2 ,4}; 
		  int N = A.length; 
		  int value = Integer.MAX_VALUE;
		  int index = 0; 
		  for(int i = 0; i<N;i++) {
			  int sum = 0;
			  for(int j = 0; j<N;j++) {
				 if(i!=j) { 
					 sum += A[j]; 
				 } 
			  }
			  if(sum%7 == 0) { 
					 if(A[i]<value) {
						 value = A[i];
						 index = i;
					 }
				 }  
		  }
		    System.out.println(value + " : " + index);
		  }
	  
	  
	  public static void numberofping(){
		  	String str = "maasms";
		  	String str2 = "masa";
		  	int n = str.length(); 
		  	int min = Integer.MAX_VALUE;
		    HashMap<Character,Integer> ping = new HashMap<>(); 
		    for(int i = 0; i<n;i++){
		        Character ch = str.charAt(i);
		        int value = ping.getOrDefault(ch,0);
		        value++;
		        ping.put(ch,value); 
		    } 
		    System.out.println(ping);
		    for(int x = 0;x<str2.length();x++) {
	    		if(!ping.containsKey(str2.charAt(x))) {
	    			ping.put(str2.charAt(x), 0);
	    		}
	    	} 
		    System.out.println(ping);
		    for(int i = 0; i<str2.length();i++) {   
		    	if((Integer) ping.get(str2.charAt(i)) < min) {
		    		min = (Integer) ping.get(str2.charAt(i));
		    	}
		    }  
		    System.out.println("Minimum Number is Ping : " + min); 
	}


	public static void longestNonVowelSubstring( ){
		String str = "abcded";
		int n = str.length();
		int len = 0;
	    for(int i = 0; i<n;i++){
	        for(int j = i+1; j<=n;j++){ 
	            if(!containsVowel(str.substring(i,j))) {
	            	if(str.substring(i,j).length() > len) { 
	            		 len = str.substring(i,j).length();
	            	}
	            }
	        }
	    }
	    System.out.println(len);
	}
	
	public static boolean containsVowel(String str) {
		boolean flag = false;
		for(int i = 0; i<str.length();i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				flag  = true;
				break;
			}
		}
		return flag;
	}

	public static void spiralTraversal(   ) {
		int[][] mat = {{ 1, 2, 3, 4},
					   { 5, 6, 7, 8},
					   { 9,10,11,12},
					   {13,14,15,16}}; 
		int rows = mat.length;
		int cols = mat[0].length;
		System.out.println(rows + " : " + cols );
		
		int top = 0;
		int bot = rows-1;
		int left = 0 ;
		int right = cols-1; 
		
		while(top<= bot && left<=right) {
			for(int i = bot;i>=top;i--) {
				System.out.print(mat[i][left] + " ");
			}
			left++;
			for(int i = left;i<=right;i++) {
				System.out.print(mat[top][i] + " ");
			}
			top++;
			for(int i = top;i<=bot && right >=left;i++) {
				System.out.print(mat[i][right] + " ");
			}
			right--;
			for(int i = right;i>=left && top<=bot;i--) {
				System.out.print(mat[bot][i] + " ");
			}
			bot--;
		}
		System.out.println();
	}
	 
	public static void medicineOfLifeTakingInp(){ 
	    Scanner sc = new Scanner(System.in);
	    int tc = sc.nextInt();  
	    int[] arr = null;
	    int N = 0 ;
	    int K = 0;
		    while(tc>0) {
		    	N = sc.nextInt();
		    	K = sc.nextInt();
		    	arr = new int[N];
		    	for(int i = 0; i<N;i++){
		    		arr[i] = sc.nextInt();	
		    	}
		    	tc--;
		    	
		    	   boolean possible = false;
		      	    for(int i = 0; i<N; i++){
		      	        for(int j = i; j<N; j++){
		      	            if(arr[i] + arr[j] == K &&  i!= j){ 
		      	            	possible = true;  
		      	            }
		      	        }
		      	    }   
		      	    if(possible){
		      	        System.out.println("Possible"); 
		      	    }else{
		      	        System.out.println("Impossible"); 
		      	    }
		    } 
	    }
	
		public static void suchpairreturns(){  
			 Scanner sc = new Scanner(System.in);
			    int tc = sc.nextInt();  
			    int[] arr = null;
			    int N = 0 ;
			    int K = 0;
				    while(tc>0) {
				    	N = sc.nextInt();
				    	K = sc.nextInt();
				    	arr = new int[N];
				    	for(int i = 0; i<N;i++){
				    		arr[i] = sc.nextInt();	
				    	}
				    	tc--; 
				    	
				    	   boolean win = false;
				      	    for(int i = 0; i<N; i++){
				      	        for(int j = i; j<N; j++){
				      	            if(arr[i] + arr[j] == K && i!= j ){ 
				      	                win = true;  
				      	            }
				      	        }
				      	    }   
				      	    if(win){
				      	        System.out.println("1"); 
				      	    }else{
				      	        System.out.println("-1"); 
				      	    }
				    } 
			    }
	
	public static void indVsNzTakingInp(){ 
    Scanner sc = new Scanner(System.in);
    int tc = sc.nextInt();  
    int[] arr = null;
    int N = 0 ;
    int K = 0;
	    while(tc>0) {
	    	N = sc.nextInt();
	    	K = sc.nextInt();
	    	arr = new int[N];
	    	for(int i = 0; i<N;i++){
	    		arr[i] = sc.nextInt();	
	    	}
	    	tc--;
	    	
	    	   boolean win = false;
	      	    for(int i = 0; i<N; i++){
	      	        for(int j = i; j<N; j++){
	      	            if(arr[i] + arr[j] == K && i != j){ 
	      	                win = true;  
	      	            }
	      	        }
	      	    }   
	      	    if(win){
	      	        System.out.println("Yes"); 
	      	    }else{
	      	        System.out.println("No"); 
	      	    }
	    } 
    } 
 
	public static void pairLessThanK(){ 
	    Scanner sc = new Scanner(System.in);
	    int tc = sc.nextInt();  
	    int[] arr = null;
	    int N = 0 ;
	    int K = 0;
	    int max = 0;
	    while(tc>0) {
	    	N = sc.nextInt(); 
	    	arr = new int[N];
	    	for(int i = 0; i<N;i++){
	    		arr[i] = sc.nextInt();	
	    	}
	    	K = sc.nextInt();
	    	tc--; 
	    	   boolean win = false;
	      	    for(int i = 0; i<N; i++){
	      	        for(int j = i; j<N; j++){ 
	      	            if( arr[i]+arr[j] < K && i!=j ){  
	      	            	win = true; 
	      	                max = arr[i]+arr[j];  
	      	            }
	      	        }
	      	    }   
	      	    if(win){
	      	        System.out.println(max); 
	      	    }else{
	      	        System.out.println("-1");  
	      	    }
	    }
	     
	     
	 
	    }
	
	public static void pairLessThanK(int N, int[] arr,int K){  
	    int[] arr2 = arr;
	    int N2 = N;
	    int K2 = K;
	    int max = 0; 
	    	   boolean win = false;
	      	    for(int i = 0; i<N2; i++){
	      	        for(int j = i; j<N2; j++){ 
	      	            if( arr2[i]+arr2[j] < K2 && i!=j ){  
	      	            	win = true; 
	      	                max = arr2[i]+arr2[j];  
	      	            }
	      	        }
	      	    }   
	      	    if(win){
	      	        System.out.println(max); 
	      	    }else{
	      	        System.out.println("-1");  
	      	    }
	    }
	public static int maxOfThree(int a,int b, int c) {
		int max = 0;
		if(a>=b && a>=c) {
			  max = a;
		}else if( b>=a && b>=c) {
			  max = b;
		}else if(c>=a && c>=a) {
			  max = c;
		}
		return max;
	}
	public static int minOfThree(int a,int b, int c) {
		int min = 0;
		if(a<=b && a<=c) {
			min = a;
		}else if( b<=a && b<=c) {
			min = b;
		}else if(c<=a && c<=a) {
			min = c;
		}
		return min;
			 
	}
	public static void countTriplets(int N,int K,int[] arr) {
		int count = 0; 
		for(int i = 0; i<N;i++) { 
			for(int j = i+1; j<N;j++) {
				for(int x = j+1; x<N;x++){    
					int diff = arr[x]-arr[i] ;  
						if(diff<= K) {
							 count++;
						} 
				}
			
			} 
		}
		System.out.println("Count : " + count);
		
	}
	public static void containerWithWater( ){ 
        int[] H = {1 ,6 ,6 ,2 ,5 ,4 ,5 ,3 ,4,5,6,1,3,4,5,6,7,7};
//        int n = A.length;	
        int ans = 0, i = 0, j = H.length-1, res = 0;
        while (i < j) {
            if (H[i] <= H[j]) {
                res = H[i] * (j - i);
                i++;
            } else {
                res = H[j] * (j - i);
                j--;
            }
            if (res > ans) ans = res;
        } 
        	
       
       System.out.println("max_volumne : " + ans);
       
        }
	
	   public static int sumOfSquares(int N){
	        int sum = 0;  
	            while(N>0){ 
	            sum += (N%10) * (N%10);
	            N = N/10; 
	        }   
	        return sum;
	      }
	      public static void HappyNumber(int N){ 
	    	  int M = N;
	        while(N != 1 &&  N!=4){
	            N = sumOfSquares(N);
	        }
	        if(N ==1 ){ 
//	            System.out.println("Yes");
	            System.out.println("M : " + M);
	        }else{
//	            System.out.println("No");
	        }
	      }
	      public static void HappyNumber( ){ 
	    	  for(int i = 2; i<100;i++) {
	    		  HappyNumber(i);
	    	  }
	      }
	      public static void countTriplets2Pointer() {
	    	  int N = 4;
	    	  int K = 2;
	    	  int[] arr = {-3 ,-2, -1, 0};
	    	  int count = 0; 
	  		int l = 0;
	  		int r = 0;
	  		while(l<N){
	  		    while(r<N && arr[r]-arr[l]<=K){
	  		        r++;
	  		    }
	  		    int m = r-l-1;
	  		    count += m * m-1 / 2;
	  		    l++;
	  		}
	      System.out.println(count); 
	  	} 
	      public static void bubbleSorting( ){ 
	    	  int[] arr = {1,5,3,4,2}; 
	    	  int N = arr.length;
	    	  for(int i = 0; i<N;i++){
	               System.out.print(arr[i] + " ");
	           }
	    	  System.out.println();
	          for(int i = 0; i<N-1;i++){
	              for(int j = 0; j<N-i-1;j++){
	            	  System.out.println(i + " : " + j);
	                  if(arr[j]>arr[j+1]){
	                      int temp = arr[j];
	                      arr[j] = arr[j+1];
	                      arr[j+1] = temp;
	                  } 
	              }
	          }
	           for(int i = 0; i<N;i++){
	               System.out.print(arr[i] + " ");
	           }
	          
	      }
	      public static void optimumBubbleSorting( ){ 
//	    	  int[] arr = {1,5,3,4,2}; 
	    	  int[] arr = {1,2,3,4,5}; 
	    	  int N = arr.length;
	    	  for(int i = 0; i<N;i++){
	               System.out.print(arr[i] + " ");
	           }
	    	  for(int i = 0; i<N-1;i++){
	    		  boolean flag = true;
	              for(int j = 0; j<N-i-1;j++){ 
	            	  System.out.println(i + " : " + j);
	                  if(arr[j]>arr[j+1]){
	                      int temp = arr[j];
	                      arr[j] = arr[j+1];
	                      arr[j+1] = temp;
	                      flag = false;
	                  } 
	              }
	              if(flag) {
	            	  break;
	              }
	          }
	    	  System.out.println();
	           for(int i = 0; i<N;i++){
	               System.out.print(arr[i] + " ");
	           }
	          
	      }
	      
	      public static void selectionSorting(){ 
	    	  int[] arr = {1,5,3,4,2}; 
	    	  int N = arr.length;
	    	  
	          for(int i = 0; i<N-1;i++){
	              int x = i;
	              for(int j = i+1; j<N;j++){
	                 if(arr[x]>arr[j]) {
	                	 x =  j; 
	                 }
	              } 
	              int temp = arr[x];
                  arr[x] = arr[i];
                  arr[i] = temp;
	              
	          }
	           for(int i = 0; i<N;i++){
	               System.out.print(arr[i] + " ");
	           }
	          
	      } 
	      public static void squareRootSorting( ){ 
	    	  int[] arr  = {8 ,4 ,5 ,11, 9};
	    	  int N = arr.length;
	          for(int i = 0; i<N-1;i++){
	              for(int j = 0; j<N-i-1;j++){
	                  int a = (int) Math.sqrt(Math.abs(arr[j]));
	                  int b = (int) Math.sqrt(Math.abs(arr[j+1]));
	                  System.out.println(a + " : " + b);
	                  if(a>b){
	                      int temp = arr[j];
	                      arr[j] = arr[j+1];
	                      arr[j+1] = temp;
	                  }
	                  if(a==b){
	                      if(arr[j] > arr[j+1]){
	                      int temp = arr[j];
	                      arr[j] = arr[j+1];
	                      arr[j+1] = temp; 
	                      }
	                  }
	              }
	          }
	           for(int i = 0; i<N;i++){
	               System.out.print(arr[i] + " ");
	           }
	            System.out.println();
	          
	      } 
	       
	      public static void newSortintAlgorithm( ){ 
	    	  int[] arr  = {12 ,18 ,17 ,65, 46};
	    	  int N = arr.length;
	    	  int  K =6;
	          for(int i = 0; i<N-1;i++){
	              for(int j = 0; j<N-i-1;j++){
	                  int a = arr[j]%K ;
	                  int b = arr[j+1]%K; 
	                      if(a > b){
	                      int temp = arr[j];
	                      arr[j] = arr[j+1];
	                      arr[j+1] = temp; 
	                       
	                  }
	              }
	          }
	           for(int i = 0; i<N;i++){
	               System.out.print(arr[i] + " ");
	           }
	            System.out.println();
	          
	      } 
	      
	      public static void removetoSort(){
	    	  int[] arr = {4 ,8 ,3 ,7 ,2, 1, 5, 9, 6, 10};
	    	  int N = arr.length; 
	          ArrayList<Integer> arr2 =  new ArrayList<>();
	          arr2.add(arr[0]);
	          for(int i = 1; i<N;i++){ 
	            	 if(arr2.get(arr2.size()-1) <= arr[i]) {
	            		 arr2.add(arr[i]);
	            	 }
	          }
	           for(int i = 0; i<arr2.size();i++){
	               System.out.print(arr2.get(i) + " ");
	           }
	            System.out.println();
	          
	      }
	      
	      public static void ThreeMaxThreeMin(){
//	    	  Input
//	    	  10
//	    	  -4 -7 -2 -11 -2 -8 0 -122 -66 10
//	    	  Expected Output
//	    	  -122 -66 -11
//	    	  -2 0 10
//	    	  Output
//	    	  -122 -66 -11 -8 
//	    	  -2 0 10 
	    	  
//	    	  6
//	    	  51 0 0 11 -11 23
//	    	  Expected Output
//	    	  -11 0 11
//	    	  11 23 51
//	    	  Output
//	    	  -11 0 
//	    	  11 23 51 
	    	  
	    	  int[] arr = {-4 ,-7, -2, -11, -2, -8, 0, -122, -66, 10};
	    	  int N = arr.length;
	          for(int i = 0; i<N-1;i++){
	              for(int j = 0; j<N-i-1;j++){
	                  if(arr[j]>arr[j+1]){
	                      int temp = arr[j];
	                      arr[j] = arr[j+1];
	                      arr[j+1] = temp;
	                  }
	              }
	          }
	          
	          ArrayList<Integer> arr2 =  new ArrayList<>();  
	        	  for(int i = 0; i<N;i++) {
	        		  System.out.println("I : " + i);
	        		  if(!arr2.contains(arr[i])){
	        			  arr2.add(arr[i]); 
	        		  }
	        	  } 
	            
	        	  for(int i = N-1; i>=0;i--) { 
	        		  if(!arr2.contains(arr[i])){
	        			  arr2.add(arr[i]);  
	        		  }
	        	  }
	        	  
	          for(int i = 0; i<3;i++) {
	        	  System.out.print(arr2.get(i)+ " ");
	          } 
	          System.out.println();
	          for(int i = arr2.size()-3; i<=arr2.size()-1;i++) {
	        	  System.out.print(arr2.get(i)+ " ");
	          } 
	           
	           
	          
	      }	
	public static void pushPopTop( ) {
		  
        Scanner sc = new Scanner(System.in);
		 ArrayList<Integer> arr = new ArrayList< >();
	    int N = sc.nextInt();
	    int[] arr2 = new int[N];
	    for(int i = 0; i<N;i++) { 
	    	int n =sc.nextInt(); 
	    	 if(n == 1) { 
	    		 int x = sc.nextInt();
	    		 arr2[i] = n;
		    	 arr.add(x);
		     }else { 
		    	 arr2[i] = n;
		     }
	     }
	    
	    
	     
	   //  for(int i = 0; i<arr.size()-1;i++){
	   // 	 System.out.println(arr.get(i));
	   //  } 
	    Stack<Integer> st = new Stack<>(); 
	    int a =0;
	    int j = 0;
	    for(int i = 0; i<N;i++) { 
	    	if(arr2[i] == 1) { 
	    		st.push(arr.get(j));  
	    		j++;
	    	}else if(arr2[i] == 2 && st.size()>0) {
	    	 st.pop(); 
	    	}else if(arr2[i] == 3)  {
	    		if(st.size()==0) {
	    			 System.out.println("Empty!");
	    		}else{
	    		    System.out.println( st.peek());
	    		}  
	    	}
	    } 
	}
	
	public static void masaiRestaurantStack() {
        Scanner sc = new Scanner(System.in);
		 ArrayList<Integer> arr = new ArrayList< >();
	    int N = sc.nextInt();
	    int[] arr2 = new int[N];
	    for(int i = 0; i<N;i++) { 
	    	int n =sc.nextInt(); 
	    	 if(n == 2) { 
	    		 int x = sc.nextInt();
	    		 arr2[i] = n;
		    	 arr.add(x);
		     }else { 
		    	 arr2[i] = n;
		     }
	     }
	    
	    
	    Stack<Integer> st = new Stack<>();
	    int j = 0;
	    for(int i = 0; i<N;i++){ 
	        if(  arr2[i] == 1){
	            if(st.size()>0){
	               System.out.println(   st.pop());
	            }else{
	                 System.out.println("No Food");
	            }
	           
	        }else{  
	            st.push(arr.get(j));
	            j++;
	        }
	    }
	     
  }
	
	public static void  findspan(){
//		int[] p = {100 ,80 ,60, 70, 60, 75, 85};
		int[] p = {10,20,30,40,50,60,70};
		int n = p.length;
			Stack<Integer> st = new Stack<>();
			int res[] = new int[n];
			res[0] = 1;
			st.push(0);
			for(int i = 1; i<n;i++){
//				System.out.println(p[st.peek()] + " : " + p[i]);
				while(!st.isEmpty() && p[st.peek()]<p[i]){
				st.pop(); 
				}
				if(!st.isEmpty()){
				res[i] = i-st.peek();
				}else {
//					res[i] = res[i-1]+1;
					res[i] = i+1;
				} 
				st.push(i);
			}
			
			
			for(int i = 0; i<n;i++) {
				System.out.print(  res[i] + " ");
			}
	} 
	 public static boolean  classicalStackProblem(String str){ 
	        
	        if(str.length()%2 != 0){
	            return false;
	        }
	        char[] ch = new char[str.length()];
		        for(int i = 0; i<str.length();i++){
		            ch[i] = str.charAt(i);
		        }
		        if(ch[0] == ')' || ch[0] == '}' ||  ch[0] == ']'){
		                return false;
		             }
		         Stack<Character> st = new Stack<>();  
		         for(int i = 0; i<str.length();i++ ){
		             char ch1 = ch[i];
		             if(ch1 == '{' || ch1 == '(' ||  ch1 == '['){
		                 st.push(ch[i]);
		             }else{
		                 if(!st.isEmpty()){
		                     char ch2 = st.pop(); 
		                 if(ch1 == ')' && ch2 != '('){ 
		                     return false;
		                 }else if(ch1 == '}' && ch2 != '{'){
		                     return false;
		                 }else if(ch1 == ']' && ch2 != '['){
		                     return false;
		                 }
		                 } 
		             }
		         } 
		        
		          
		              return st.isEmpty();
		          
		        
		     }
	 public static void smallerNeighbourElementtoLeft( ){
		 int N = 8;
		 int[] arr = {39,27,11,4,24,32,32,1	};
		 
         int[] res = new int[N];
         Stack<Integer> st = new Stack<>();
         st.push(0);
         res[0] = -1;
         for(int i = 1; i<N;i++) { 
        	 while(!st.isEmpty()&& arr[st.peek()]>arr[i]) {
        		  st.pop();
        	 }  
    	 	if(!st.isEmpty()) {
    			 System.out.println("arr[st.peek()] : " + arr[st.peek()] + " : " +  st.peek()); 
    			 res[i] = arr[st.peek()];
    		 }else {
    			 res[i] = -1;
    		 }
        	 
        	 st.push(i);
         }
         for(int i = 0; i<N;i++) {
        	 System.out.print(res[i] + " ");
         }
     }
	 public static void smallerNeighbourElementtoRight( ){
		 int N = 8;
		 int[] arr = {39,27,11,4,24,32,32,1	};
		 int[] res = new int[N];
//		 27 11 4 1 1 1 1 -1
		 Stack<Integer> st = new Stack<>();
		 st.push(N-1);
		 res[N-1] = -1;
		 for(int i = N-2;i>=0;i--) {
			 while(!st.isEmpty() && arr[st.peek()]>= arr[i]) {
				 st.pop();
			 }
			 if(!st.isEmpty()) {
				 res[i] = arr[st.peek()];
			 }else {
				 res[i] = -1;
			 }
			 st.push(i);
		 }
		 for(int i = 0; i<N;i++) {
        	 System.out.print(res[i] + " ");
         }
	 }
	 public static void reduceString( ){
//		String str = "aaabccddd";
		String str = "fffaaaaaaajsssssss"; 
		
		 Stack<Character> st = new Stack<>(); 
		    StringBuilder sb  = new StringBuilder(); 
		    st.push(str.charAt(0));
		    sb.append(str.charAt(0));
		    for(int i = 1; i<str.length();i++){
		        Character ch = str.charAt(i); 
		        if(!st.isEmpty() && st.peek() == ch) {
		        	st.pop();
		        	sb.deleteCharAt(sb.length()-1);
		        }else { 
		        	  st.push(ch);
		        	  sb.append(ch);
		        }   
	 }

		    System.out.println(sb);
		  

			
}
	 public static void nextGreaterElement( ){
		 int[] arr = {1 ,3 ,2 ,4};
		 int N = arr.length;
         int[] res = new int[N];
         Stack<Integer> st = new Stack<>();
         st.push(N-1);
         res[N-1] = -1;
         for(int i = N-2; i>=0;i--) { 
        	 while(!st.isEmpty()&& arr[st.peek()]<arr[i]) {
        		  st.pop();
        	 }  
    	 	if(!st.isEmpty()) {
    			  res[i] = arr[st.peek()];
    		 }else {
    			 res[i] = -1;
    		 }
        	 
        	 st.push(i);
         }
         for(int i = 0; i<N;i++) {
        	 System.out.print(res[i] + " ");
         }
     }
	 
	 public static boolean  stringWithParanthesis(String str  ){ 
//		 String str = "[one[two[three[four[five[six[seven[eight[nine[ten]]]]]]]]]]";
		 StringBuilder sb = new StringBuilder();
		 for(int i = 0; i<str.length();i++) {
			  if(str.charAt(i) == '(' ||str.charAt(i) == '{' || str.charAt(i) == '[' || 
			  str.charAt(i) == ']' || str.charAt(i) == '}' || str.charAt(i) == ')' ){
				   sb.append(str.charAt(i));
			  }
		 }
		 String str2 = sb.toString();
		 
	        if(str2.length()%2 != 0){
	            return false;
	        }
	        char[] ch = new char[str2.length()];
		        for(int i = 0; i<str2.length();i++){
		            ch[i] = str2.charAt(i);
		        }
		        if(ch[0] == ')' || ch[0] == '}' ||  ch[0] == ']'){
		                return false;
		             }
		         Stack<Character> st = new Stack<>();  
		         for(int i = 0; i<str2.length();i++ ){
		             char ch1 = ch[i];
		             if(ch1 == '{' || ch1 == '(' ||  ch1 == '['){
		                 st.push(ch[i]);
		             }else{
		                 if(!st.isEmpty()){
		                     char ch2 = st.pop(); 
		                 if(ch1 == ')' && ch2 != '('){ 
		                     return false;
		                 }else if(ch1 == '}' && ch2 != '{'){
		                     return false;
		                 }else if(ch1 == ']' && ch2 != '['){
		                     return false;
		                 }
		                 } 
		             }
		         } 
		        
		         
		         if(st.isEmpty()){
		              return true;
		         }else{
		              return false;
		         }
		        
		     }
	 
	  public static void droppingBalls(  ){  
		    //      System.out.println("N : " + x);
		    //      System.out.println("N : " + y);
		    //   for(int i = 0; i<x;i++){
		    //          for(int j = 0; j<y;j++){
		    //              System.out.print( arr[i][j] + " ");
		    //          }
		    //           System.out.println ();
		    //      }
		    //      for(int j = 0; j<k;j++){
		    //                  System.out.print( arr2[j] + " ");
		    //          }
		   
		  int n = 5;
		  int m = 5;
		  int k = 3;
		  int[][] arr = {
						  {1 ,2 ,3 ,3, 3},
						  {2 ,2 ,2 ,2 ,2},
						  {2 ,2 ,2 ,2 ,2},
						  {2 ,2 ,2 ,2 ,2},
						  {2 ,2, 2, 2, 2},
		  				};
		  int[] arr2 = {1,2,1}; 
		  ArrayList<Integer> res = new ArrayList<>();
	 	           
		  			for(int i = 0; i<k;i++) {
		  				 int x = 0;
		  				 int y =arr2[i]-1;
		  				 while(x<m) { 
		  					 if(arr[x][y] ==1 ) { 
		  						arr[x][y] = 2;
		  						 y++;  
		  					 }else if( arr[x][y] == 2){ 
		  						 x++;
		  					 }else if( arr[x][y] == 3){
		  						arr[x][y] = 2;
		  						 y--; 
		  					 }
		  					 
		  				 } 
		  				 res.add(y+1);
		  			}
		  			
		  			 for(int i = 0; i<k;i++) {
		  				System.out.print( res.get(i) + " ");
		  			 }

		           
		              
		         
		          
		      }
	  
	  public static void alanAndChristopher(String str){
//          System.out.println(str);
         Stack<Character> st = new Stack<>(); 
         
               StringBuilder sb = new StringBuilder();
                for(int i = 0;i<str.length();i++){
                    if(!st.isEmpty() && str.charAt(i)=='#'){ 
                        st.pop(); 
                    }else{ 
                        st.push(str.charAt(i));
                    } 
                } 
                for(int i = 0; i<=st.size();i++){ 
                    sb.append(st.pop());
                }
                System.out.println(  sb.reverse());
                
     }
	  public static void nearestSmallerToLeft(){ 
		  int[] arr = {2,3,4,5,1,4,9,3,1,5,4,2}; 
//		  4,4,4,4,-1,8,8,8,-1,12,12,-1
		  int N = arr.length;
		  Stack<Integer> st  = new Stack<>();
		  int[] res = new int[N];
		  st.push(0);
		  res[0] = -1;
		  for(int i = 1; i<N;i++) {
			  while(!st.isEmpty() && arr[st.peek()]>=arr[i]) {
				  st.pop();
			  }
			  if(st.isEmpty()) {
				  res[i] =  -1;
			  }else {
				  res[i] = st.peek();
			  }
			  st.push(i);
		  }
		  for(int i = 0; i<N;i++) {
			  	System.out.print(res[i] + " ");
		  }
	  }
	  public static void nearestSmallerToRight(){ 
		  int[] arr = {2,3,4,5,1,4,9,3,1,5,4,2}; 
//		               0,1,2,3,4,5,6,7,8,9,10,11
//		  4,4,4,4,-1,7,7,8,-1,10,11,-1
		  int N = arr.length;
		  Stack<Integer> st  = new Stack<>();
		  int[] res = new int[N];
		  st.push(N-1);
		  res[N-1] = -1;
		  for(int i = N-1; i>=0;i--) {
			  while(!st.isEmpty() && arr[st.peek()]>=arr[i]) {
				  st.pop();
			  }
			  if(st.isEmpty()) {
				  res[i] =  -1;
			  }else {
				  res[i] = st.peek();
			  }
			  st.push(i);
		  }
		  for(int i = 0; i<N;i++) {
			  	System.out.print(res[i] + " ");
		  }
	  }
	  
	  public static void nearestGreaterToRight(){ 
//		  int[] arr = {2, 3, 4, 5, 1, 4, 9, 3, 1, 5, 4, 2}; 
//		               0, 1, 2, 3, 4, 5, 6, 7, 8, 9,10, 11
//		 			   1, 2, 3, 6, 5, 6,-1, 9, 9, -1,-1,-1
		  int[] arr = {5,1,6,2,5,1};
		  int N = arr.length;
		  Stack<Integer> st  = new Stack<>();
		  int[] res = new int[N];
		  st.push(N-1);
		  res[N-1] = -1;
		  for(int i = N-1; i>=0;i--) {
			  while(!st.isEmpty() && arr[st.peek()]<=arr[i]) {
				  st.pop();
			  }
			  if(st.isEmpty()) {
				  res[i] =  -1;
			  }else {
				  res[i] = st.peek();
			  }
			  st.push(i);
		  }
		  for(int i = 0; i<N;i++) {
//			  	System.out.print(res[i] + " ");
			  if(!(res[i] == -1)) {
				  System.out.print(arr[res[i]] + " ");
			  }else {
				  System.out.print("-1 ");
			  } 
		  }
		  
		  
		  
		  
	  }
	  public static void nearestGreaterToLeft(){ 
		  int[] arr = {2, 3, 4, 5, 1, 4, 9, 3, 1, 5, 4, 2}; 
//		               0, 1, 2, 3, 4, 5, 6, 7, 8, 9,10, 11
//		 			   -1,-1,-1,-1,3, 3,-1, 6, 7, 6, 9, 10
		  int N = arr.length;
		  Stack<Integer> st  = new Stack<>();
		  int[] res = new int[N];
		  st.push(0);
		  res[0] = -1;
		  for(int i = 1; i<N;i++) {
			  while(!st.isEmpty() && arr[st.peek()]<=arr[i]) {
				  st.pop();
			  }
			  if(st.isEmpty()) {
				  res[i] =  -1;
			  }else {
				  res[i] = st.peek();
			  }
			  st.push(i);
		  }
		  for(int i = 0; i<N;i++) {
//			  	System.out.print(res[i] + " ");
			  	System.out.print(arr[res[i]] + " ");
		  }
	  }
	  
	  
	  public static void maxRetangleAreaInHistogram(){ 
//		  int[] arr = {39 ,27, 11, 4, 24, 32, 32, 1};
		  int[] arr = {7,5,4,3,6,8};
		  int N = arr.length;
	         Stack<Integer> st = new Stack<>();
	         Stack<Integer> st2 = new Stack<>();
	         int[] nearestSmallerLeft = new int[N];
	         int[] nearestSmallerRight = new int[N];
	         st.push(0);
	         nearestSmallerLeft[0] = -1;
	         for(int i = 1; i<N;i++) { 
	        	System.out.println(i + " : " + arr[st.peek()] + " : " + arr[i]);
	        	 while(!st.isEmpty() && arr[st.peek()]>=arr[i]) {
	        		 st.pop();
	        	 }
	        	 if(!st.isEmpty()) {
	        		 nearestSmallerLeft[i] = st.peek();
	        	 }else {
	        		 nearestSmallerLeft[i] = -1;
	        	 }
	        	 st.push(i); 
	         }
	         st2.push(N-1);
	         nearestSmallerRight[N-1] = N;
	         for(int i = N-2; i>=0;i--) { 
	        	
	        	 while(!st2.isEmpty() && arr[st2.peek()]>=arr[i]) {
	        		 st2.pop();
	        	 }
	        	 if(!st2.isEmpty()) {
	        		 nearestSmallerRight[i] = st2.peek();
	        	 }else {
	        		 nearestSmallerRight[i] = -1;
	        	 }
	        	 st2.push(i); 
	         }

	         for(int i = 0; i<N;i++) {
	        	 System.out.print( nearestSmallerLeft[i] + " ");
	         }
	         System.out.println();
	         for(int i = 0; i<N;i++) {
	        	 System.out.print( nearestSmallerRight[i] + " ");
	         }
	         System.out.println();
	         int max_vol = 0;
	         for(int i = 0; i<N;i++) {
	        	int vol =  0;
	        	int l = nearestSmallerRight[i] - nearestSmallerLeft[i] -1;
	        	vol = arr[i] * l;
//	        	System.out.println("I : " + " :: " + vol + " : : " + max_vol);
	        	max_vol = Math.max(max_vol, vol);
	         }
	         System.out.println("MAX VOL : " + max_vol);
	     }
	  public static void happyNewYear( ) {
		  Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int[] arr2 = new int[N];
	        ArrayList<Integer> arr = new ArrayList<>();
	        for(int i = 0; i<N;i++){
	            int x = sc.nextInt();
	           if(x == 1 || x == 2){
	              arr2[i] = x;
	              arr.add(sc.nextInt());
	           }else {
	        	   arr2[i] = x;
	           }
	        }
	        System.out.println("N : " + N);
	        for(int i = 0; i<N;i++) {
	        	System.out.print(arr2[i] + " ");
	        }
	        System.out.println();
	        for(int i = 0; i<arr.size();i++) {
	        	System.out.print(arr.get(i) + " ");
	        }
	        Stack<Integer> st = new Stack<>();
	        Queue<Integer> q = new LinkedList<>();
	        int j = 0;
	         for(int i = 0; i<N;i++) {  
	        	 if(arr2[i] == 1) {
	        		 q.offer(arr.get(j));
	        		 j++;  
	        	 }else if(arr2[i] == 2) {
	        		 st.add(arr.get(j));
	        		 j++;  
	        	 }else if(arr2[i] == 3) {
	        		 if(q.isEmpty()){
	        		     System.out.println("-1");
	        		 }else{
	        		     System.out.println(q.peek());
	        		 }
	        	 }else if(arr2[i] == 4) {
	        		 if(st.isEmpty()){
	        		     System.out.println("-1");
	        		 }else{
	        		     System.out.println(st.peek());
	        		 }
	        	 }else if(arr2[i] == 5) { 
	        		 if(!q.isEmpty()){
	        		 st.add(q.remove());  
	        		 }else {
	        			 System.out.println("-1");
	        		 }
	        	 }
	        		 
	       }
	         
	  }
	  public static String findFirstUniqueGift(String queue) {
	        Map<Character, Integer> giftCount = new LinkedHashMap<>();
	        StringBuilder firstUniqueGifts = new StringBuilder();

	        for (char gift : queue.toCharArray()) {
	            giftCount.put(gift, giftCount.getOrDefault(gift, 0) + 1);

	            // Find the first unique gift in the queue
	            char uniqueGift = '#';
	            for (char c : giftCount.keySet()) {
	                if (giftCount.get(c) == 1) {
	                    uniqueGift = c;
	                    break;
	                }
	            }

	            firstUniqueGifts.append(uniqueGift);
	        }
	        System.out.println();
	        return firstUniqueGifts.toString();
	    }

	     
	  public static void uniqueGift(String str){
	         StringBuilder sb = new StringBuilder();
	         HashMap<Character,Integer> map = new HashMap<>(); 
	         for(int i = 0; i<str.length();i++){
	             Character ch = str.charAt(i); 
	            map.put(ch, map.getOrDefault(ch, 0)+1);
	            Character ch3 = '#';
			           for(int j = 0; j<str.length();j++){
			        	   Character ch2 = str.charAt(j);
			            if(map.containsKey(ch2) && (Integer)map.get(ch2) == 1) { 
				                 ch3 = ch2;  
				                 break;  
			            } 
			         }
			           sb.append(ch3);
	         
	         } 
	         System.out.println(sb);  
	     }
	  public static void gifts( ){
		  int[] arr = {1, 2 ,2,1};
		  int N = arr.length;
	        int count = 0;
	        for(int i = 0; i<N;i++){
	            for(int j = i; j<N;j++){
	            	HashMap<Integer,Integer> map = new HashMap<>(); 
	                for(int k = i; k<=j;k++){ 
                        map.put(arr[k], map.getOrDefault(arr[k], 0)+1); 
	                }
	                boolean ind = true;
	                for(Map.Entry m2:map.entrySet()) {
	                	if((Integer)m2.getValue() > 1) {
	                		ind = false;
	                		break;
	                	}
	                } 
//	                System.out.println(map);
	                if(ind) { 
	                	count = Math.max(count, map.size()); 
	                }

	               
	            }
	        }
	        System.out.println(count);
		}
	  
	  public static int longestUniqueGiftSequence(int[] gifts) {
	        int n = gifts.length;
	        int max = 0;
	        int l = 0;
	        HashMap<Integer, Integer> map = new HashMap<>();
//	        1 2 1 3 2 7 4 2
	        for (int r = 0; r < n; r++) {
	            int gift = gifts[r]; 
	            if (map.containsKey(gift)) {
	                l = Math.max(l, map.get(gift) + 1);
	            }

	            map.put(gift, r);
	            System.out.println(map);
	            max = Math.max(max, r - l + 1);
	        }

	        return max;
	    }
	 public static void  NonRepetitiveSubstrings( ){
	          String str =  "xcrebardk";
	          int N = 9;
	          int count = 0;  
	          for(int i = 0; i<=str.length()-N;i++){
	            	boolean ind = true;
	        	  HashMap<Character, Integer> map = new HashMap<>();
	            for(int j = i; j<i+N;j++) { 
	            	 if(j<str.length()) {
	            		 map.put(str.charAt(j), map.getOrDefault(str.charAt(j), 0)+1); 
	            	 }else {
	            		 break;
	            	 }
	            	System.out.print(str.charAt(j));  
	            }
	            System.out.println();
	            for(Map.Entry m : map.entrySet()) {
	            	if((Integer)m.getValue()>1) {
	            		ind = false;
	            	}
	            }
	            if(ind) {
	            	count++;
	            } 
	          }
	          System.out.println(count);
	  }
	 public static void minNoOfCoins( ){
		int price =  45; 
        int[] arr = {1,2,5,10,20,50,100,500,1000};
        int N = arr.length;
        int coins = 0;
        
        for(int i = N-1;i>=0;i--) {
        	while(arr[i]<=price && price>0) {
        	
        	price -= arr[i];
       		 coins++;
       		System.out.println(coins + " : " + price);	
       		
        	}
        }
//        int i = N-1;
//        while(i>=0) {
//        	 if(arr[i]<price) {
//        		 price += arr[i];
//        		 coins++;
//        	 }
//        }
        
        System.out.println(coins);
	        
	    }
	 public static void  NSGProductEval3(){
		 int[] arr = {5,1,6,2,5,1};
		 int N = arr.length;
	        int[] greater = new int[N];
	        int[] smaller = new int[N];
	        Stack<Integer> gr = new Stack<>();
	        Stack<Integer> lo = new Stack<>();
	        
	        greater[N-1] = -1;
	        gr.push(N-1); 
	        for(int i = N-1;i>=0;i--){
	            
	            while(!gr.isEmpty()&& arr[gr.peek()] <= arr[i]){
	                gr.pop();
	            }
	            if(!gr.isEmpty()){
	                greater[i] = gr.peek();
	            }else{
	                greater[i] = -1;
	            }
	            gr.push(i);
	        }
	        for(int i = 0; i<N;i++){
	            // System.out.println(greater[i]);
	             if(!(greater[i] == -1)) {
					  System.out.print(arr[greater[i]] + " ");
				  }else {
					  System.out.print("-1 ");
				  }
	        }
	        
	        smaller[N-1] = -1;
	        lo.push(N-1); 
	        for(int i = N-1;i>=0;i--){
	            
	            while(!lo.isEmpty()&& arr[lo.peek()] >= arr[i]){
	                lo.pop();
	            }
	            if(!lo.isEmpty()){
	                smaller[i] = lo.peek();
	            }else{
	                smaller[i] = -1;
	            }
	            lo.push(i);
	        } 
	        System.out.println();
	        for(int i = 0; i<N;i++){
	            // System.out.print(smaller[i] + " ");
	            if(!(smaller[i] == -1)) {
					  System.out.print(arr[smaller[i]] + " ");
				  }else {
					  System.out.print("-1 ");
				  }
	        }
	        
	        int product = 1;
	        for(int i = 0; i<N;i++){
	        	int x = greater[i];
	        	int y = -1;
	        	if(x != -1) {
	        		y = smaller[x];
	        	} 
	        	int z = -1;
	        	if(y != -1) {
	        		z = arr[y];
	        	}
//	        	System.out.println( " +++++ " + z);
	        	product *= z; 
	        }
	        System.out.println();
	        System.out.println(product); 
	        
	        
	        int[] arr2 = {1,2,3,4,5,6,8,5,4,3,2,1};
//	        int[] arr2 = {1,2,2,4,4,3,1};
	        int xy = 0;
	        for(int i = 0; i<arr2.length-1;i++) {  
	        	xy = arr2[i] ^ arr2[i+1];
	        	arr2[i+1] = xy;
	        } 
	        System.out.println("xy : " + xy);
 	    }
	 
	 public static void  smallToLeft(){
		int[] arr  = {39, 27, 11, 4 ,24 ,32, 32, 1};
		int N = arr.length;
		int[] res = new int[N];
		Stack<Integer> st = new Stack<>();
		st.push(0);
		res[0] = -1;
		for(int i = 1 ; i<N;i++) {
			 while(!st.isEmpty() && arr[st.peek()]>=arr[i]) {
				 st.pop();
			 }
			 if(!st.isEmpty()) {
				 res[i] = arr[st.peek()];
			 }else {
				 res[i] = -1;
			 }
			 st.push(i);
		}
		for(int i = 0;i <N;i++) {
		System.out.print(res[i]  + " ");	
		}
		 
	 }
	 
	 public static void  greatToRight(){
			int[] arr  = {39, 27, 11, 4 ,24 ,32, 32, 1};
			int N = arr.length;
			int[] res = new int[N];
			Stack<Integer> st = new Stack<>();
			st.push(N-1);
			res[N-1] = -1;
			for(int i = N-2 ; i>=0;i--) {
				 while(!st.isEmpty() && arr[st.peek()]<=arr[i]) {
					 st.pop();
				 }
				 if(!st.isEmpty()) {
					 res[i] = arr[st.peek()];
				 }else {
					 res[i] = -1;
				 }
				 st.push(i);
			}
			for(int i = 0;i <N;i++) {
			System.out.print(res[i]  + " ");	
			}
			 
		 }

	 


	
    
    
//	Price : 100 80 60 70 60 75 85
//LastLine	
	  
	 

}
