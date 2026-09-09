public class Day8{
    public static void main(String args[]){
        int[] marks={90,95,80,85,99};
        System.out.println("Number of Subjects : "+marks.length);
        System.out.println("1st Entered Mark : "+marks[0]);
        System.out.println("Last Entered Mark : "+marks[marks.length-1]);

        int total=0,count_even=0,count_odd=0;
        for(int i=0;i<marks.length;i++){
            total=total+marks[i];

            //Count how many elements are even and odd
            if (marks[i]%2==0){
                count_even+=1;
            }
            else{
                count_odd+=1;
            }
        }
        System.out.println("Total Marks : "+total);
        System.out.println("Number Of Even Marks : "+count_even);
        System.out.println("Number of Odd Marks : "+count_odd);
        System.out.println();

        //average of all elements.
        System.out.println("--- AVERAGE ---");
        double avg=(double)total/marks.length;
        System.out.println("Average Marks : "+avg);
        System.out.println();

        //Find the largest element
        System.out.println("--- LARGEST NUMBER ---");
        int max=marks[0];
        for (int i_1=0;i_1<marks.length;i_1++){
            if (max<marks[i_1]){
                max=marks[i_1];
            }
        }
        System.out.println("Maximum Mark : "+max);
        System.out.println();

        //Find the smallest element
        System.out.println("--- SMALLEST NUMBER ---");
        int min=marks[0];
        for (int i_1=0;i_1<marks.length;i_1++){
            if (min>marks[i_1]){
                min=marks[i_1];
            }
        }
        System.out.println("Minimum Mark : "+min);
        System.out.println();

        //positive, negative, and zero
        System.out.println("--- +VE,-VE,ZERO ---");
        int[] num={1,-2,0,3,-4,5};
        int count_positive=0;
        int count_negative=0;
        int count_zero=0;
        for (int j=0;j<num.length;j++){
            if(num[j]>0){
                count_positive+=1;
            }
            else if(num[j]<0){
                count_negative+=1;
            }
            else{
                count_zero+=1;
            }
        }
        System.out.println("Number Of Positive Numbers : "+count_positive);
        System.out.println("Number Of Negative Numbers : "+count_negative);
        System.out.println("Number Of Zero : "+count_zero);
        System.out.println();

        //reverse
        System.out.println("---REVERSE---");
        System.out.println("Reverse Order");
        for (int j_1=num.length-1;j_1>=0;j_1--){
            System.out.print(num[j_1]+" ");
        }
        System.out.println();
        System.out.println();

        //Search
        System.out.println("---SEARCH---");
        int search=0;
        boolean flag=false;
        System.out.println("Number To Be Searched : "+search);
        for(int j_2=0;j_2<num.length;j_2++){
            if (search==j_2){
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }
        System.out.println();

        //Count
        System.out.println("---COUNT---");
        int num_count=1;
        int count=0;
        for(int j_2=0;j_2<num.length;j_2++){
            if (num_count==j_2){
                count+=1;
            }
        }
        System.out.println("Number of Times "+num_count+" existed in array : "+count);
        System.out.println();

        //second largest
        System.out.println("---SECOND LARGEST---");
        int largest=num[0];
        int second_largest=num[0];
        for (int i=1;i<num.length;i++){
            if (largest<num[i]){
                second_largest=largest;
                largest=num[i];
            }
            else if(num[i]>second_largest && num[i]!=largest){
                second_largest=num[i];
            }
        }
        System.out.println("Largest Number : "+largest);
        System.out.println("Second Largest Number : "+second_largest);
        System.out.println();

        //second smallest
        System.out.println("---SECOND SMALLEST---");
        int smallest=num[0];
        int second_smallest=num[0];
        for (int i=1;i<num.length;i++){
            if (smallest>num[i]){
                second_smallest=smallest;
                smallest=num[i];
            }
            else if(num[i]<second_smallest && num[i]!=smallest){
                second_smallest=num[i];
            }
        }
        System.out.println("Smallest Number : "+smallest);
        System.out.println("Second Smallest Number : "+second_smallest);
        System.out.println();

        System.out.println("---NUMBER OF OCCURANCS---");
        int[] num_2={1,2,3,4,1,2,5,3,1,};
        for(int i=0;i<num_2.length;i++){
            int already_1=0;
            for (int k=0;k<i;k++){
                if(num_2[i]==num_2[k]){
                    already_1=1;
                    break;
                }
            }
            if(already_1==1){
                continue;
            }

            int count_freq=0;
            for(int j=0;j<num_2.length;j++){
                if(num_2[j]==num_2[i]){
                    count_freq+=1;
                }
            }
            System.out.println(num_2[i]+" Occures "+count_freq+" Times");
        }
        System.out.println();


        System.out.println("---DUPLICATE VALUE OCCURANCES---");
        int[] num2={1,2,3,4,1,2,5,3,1,};
        for(int i=0;i<num2.length;i++){
            int already=0;
            for (int k=0;k<i;k++){
                if(num2[i]==num2[k]){
                    already=1;
                    break;
                }
            }
            if(already==1){
                continue;
            }
            int count_duplicates=0;
            for (int j=0;j<num2.length;j++){
                if (num2[i]==num2[j]){
                    count_duplicates+=1;
                }
            }
            if (count_duplicates>1){
                System.out.println(num2[i]+" repeates "+count_duplicates+" Times");
            }
            System.out.println();

            System.out.println("---2D MATRIX---");

            int[][] matrix={
                {10,20,30},
                {40,50,60},
                {70,80,90}
            };

            // all elements of a matrix
            for (int i1=0;i1<matrix.length;i1++){
                for(int j1=0;j1<matrix.length;j1++){
                    System.out.print(matrix[i1][j1]+" , ");
                }
            }
            System.out.println();

            //sum of all elements
            int sum_matrix=0;
            for (int i1=0;i1<matrix.length;i1++){
                for(int j1=0;j1<matrix.length;j1++){
                    sum_matrix+=matrix[i1][j1];
                }
            }
            System.out.println("Sum Of all elements in Matrix : "+sum_matrix);
            System.out.println();

            //largest element
            int largest_matrix=matrix[0][0];
            for (int i1=0;i1<matrix.length;i1++){
                for(int j1=0;j1<matrix.length;j1++){
                    if (largest_matrix<matrix[i1][j1]){
                        largest_matrix=matrix[i1][j1];
                    }
                }
            }
            System.out.println("Largest element in the Matrix : "+largest_matrix);
            System.out.println();

            //smallest element
            int smallest_matrix=matrix[0][0];
            for (int i1=0;i1<matrix.length;i1++){
                for(int j1=0;j1<matrix.length;j1++){
                    if (smallest_matrix>matrix[i1][j1]){
                        smallest_matrix=matrix[i1][j1];
                    }
                }
            }
            System.out.println("Smallest element in the Matrix : "+smallest_matrix);
            System.out.println();

            //Count even and odd elements
            int count_even_matrix=0;
            int count_odd_matrix=0;
              for (int i1=0;i1<matrix.length;i1++){
                for(int j1=0;j1<matrix.length;j1++){
                    if (matrix[i1][j1]%2==0){
                        count_even_matrix+=1;
                    }
                    else{
                        count_odd_matrix+=1;
                    }
                }
            }
            System.out.println("Number of Even Elements In the matrix : "+count_even_matrix);
            System.out.println("Number of Odd Elements In the matrix : "+count_odd_matrix);
            System.out.println();
            
            //sum of each row
            for (int i1=0;i1<matrix.length;i1++){
                int sum_row=0;
                for(int j1=0;j1<matrix.length;j1++){
                    sum_row+=matrix[i1][j1];
                }
                System.out.println(i1+"th row Sum : "+sum_row);
            }
            System.out.println();

            //sum of each column
            for (int i1=0;i1<matrix.length;i1++){
                int sum_column=0;
                for(int j1=0;j1<matrix.length;j1++){
                    sum_column+=matrix[j1][i1];
                }
                System.out.println(i1+"th column Sum : "+sum_column);
            }
        }
    }

}