package Main;

import java.util.Random;

public class Array {
	public static void main(String[] args){
		//Main string
		
		int array[] = new int[100];
		Random rndm = new Random();
		int mean = 0,max = 0 ,arr = 0;
		//Variables
		
		
		//for loop using x<100 as the limit
		for (int x = 0; x <100; x++)
		{
			array[x] = rndm.nextInt(1000);
			mean = mean + array[x];
			//making the array get a number, then adding that number to the mean variable
			
			if(array[x]>max)
			{max = array[x];
			arr=x+1;}
			//if decision to decide if the new number is greater than previous and setting the position in the array
			
			System.out.println((x+1) + "  " + array[x]);
			//printing the array position and its number
		}
		
		mean = mean/100;
		//Finally dividing the accumulated mean and finding the average
		
		System.out.println("average of the numbers = " + mean + "   biggest number = " + max);
		System.out.println("you can find the maximum number at " + arr);
		//Printing out the numbers
	}
}
/*
1  982
2  218
3  805
4  624
5  557
6  222
7  96
8  855
9  475
10  145
11  697
12  827
13  158
14  592
15  332
16  737
17  115
18  902
19  275
20  943
21  268
22  5
23  698
24  728
25  353
26  409
27  630
28  91
29  272
30  904
31  947
32  251
33  274
34  774
35  224
36  946
37  659
38  141
39  545
40  614
41  157
42  658
43  17
44  997
45  474
46  403
47  210
48  157
49  756
50  804
51  555
52  900
53  524
54  576
55  804
56  478
57  323
58  405
59  977
60  437
61  239
62  480
63  137
64  507
65  989
66  872
67  962
68  506
69  576
70  383
71  946
72  557
73  756
74  522
75  948
76  376
77  538
78  121
79  494
80  657
81  600
82  314
83  619
84  850
85  507
86  672
87  553
88  38
89  172
90  929
91  609
92  89
93  460
94  14
95  79
96  293
97  685
98  995
99  37
100  398
average of the numbers = 513   biggest number = 997
you can find the maximum number at 44
 */
