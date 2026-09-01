 class Day6{
    public static void main(String args []){
        StringBuffer name= new StringBuffer("abinaya");
        System.out.println("Name : "+name);
        //1)-----------------------------Length---------------------------->
        System.out.println("Name Length : "+name.length());

        //2)------------------------------Append---------------------------->
        name.append("software engineer");
        System.out.println("Appended Name : "+name);

        //3)-------------------------------Insert--------------------------->
        name.insert(6," 18");
        System.out.println("Insert Age after Name : "+name);

        //4)--------------------------------Replace-------------------------->
        name.replace(0,6,"saran");
        System.out.println("Replace Name : "+name);

        //5)---------------------------------Delete-------------------------->
        name.delete(20,25);
        System.out.println("Delete the last word from a sentence : "+name);

        //6)--------------------------------DeleteCharAt----------------------->
        name.deleteCharAt(3);
        System.out.println("Delete the character at index 3 : "+name);

        //7)------------------------------------Reverse------------------------>
        System.out.println("Reversed String : "+name.reverse());

        //8)-----------------------------------Capacity------------------------>
        System.out.println("String Capacity : "+name.capacity());

        //9)--------------------------------Ensure Capacity-------------------->
        name.ensureCapacity(100);
        System.out.println("Ensure Capacity of 100 : "+name.capacity());

        //10)------------------------------------charAt------------------------>
        System.out.println("Character at 0th index : "+name.charAt(0));

        //11)----------------------------------SetCharAt()--------------------->
        // replace character at specific index
        System.out.println("Initial 0th Index Character : "+name.charAt(0));
        name.setCharAt(0, 's');
        System.out.println("Character at 0th Index : "+name.charAt(0));

        //12)---------------------------------Substring------------------------->
        System.out.println("Substring from 0th Index : "+name.substring(0));

        //13)----------------------------------indexOf-------------------------->
        System.out.println("Index of 'i' : "+name.indexOf("i"));

        //14)-------------------------------lastIndexOf()------------------------>
        System.out.println("Last Index Of 'a' : "+name.lastIndexOf("a"));

        //15)----------------------------------setLength------------------------->
        name.setLength(5);
        System.out.println("String : "+name);

        //16)------------------------------------tostring------------------------->
        String a=name.toString();
        System.out.println("String : "+a);
        System.out.println("---STRING BUILDER---");
        StringBuilder sentence = new StringBuilder("LEVEL INTERMETIATE");
         System.out.println("Sentence : "+sentence);

        //Length
        System.out.println("sentence Length : "+sentence.length());

        //Append
        sentence.append(" abinaya");
        System.out.println("Appended sentence : "+sentence);

        //Insert
        sentence.insert(6," 18");
        System.out.println("Insert Age after Name : "+sentence);

        //Replace
        sentence.replace(0,6,"saran");
        System.out.println("Replace Name : "+sentence);

        //Delete
        sentence.delete(20,25);
        System.out.println("Delete the last word from a sentence : "+sentence);

        //DeleteCharAt
        sentence.deleteCharAt(3);
        System.out.println("Delete the character at index 3 : "+sentence);

        //Reverse
        System.out.println("Reversed String : "+sentence.reverse());

        //Capacity
        System.out.println("String Capacity : "+sentence.capacity());

        //Ensure Capacity
        sentence.ensureCapacity(100);
        System.out.println("Ensure Capacity of 100 : "+sentence.capacity());

        //charAt
        System.out.println("Character at 0th index : "+sentence.charAt(0));

        //SetCharAt()
        System.out.println("Initial 0th Index Character : "+sentence.charAt(0));
        sentence.setCharAt(0, 'a');
        System.out.println("Character at 0th Index : "+sentence.charAt(0));

        //Substring
        System.out.println("Substring from 0th Index : "+sentence.substring(0));

        //indexOf
        System.out.println("Index of 'i' : "+sentence.indexOf("i"));

        //lastIndexOf()
        System.out.println("Last Index Of 'a' : "+sentence.lastIndexOf("a"));

        //setLength
        sentence.setLength(5);
        System.out.println("String : "+sentence);

        //tostring
        String a_1=sentence.toString();
        System.out.println("String : "+a_1);
    }
}
