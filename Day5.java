 class Day5 {
    public static void main(String[] args) {

        //1----------AREA OF= RHOMBUS,PENTAGON,HEXAGON,OCTAGON,TREZOID-------> 
               // System.out.println(" AREA ");
        // 1. Rhombus = (d1 * d2) / 2
       // float d1 = 10, d2 = 8;
       // float areaRhombus = (d1 * d2) / 2;
       // System.out.println("Rhombus Area : " + areaRhombus);
        

        // 2. Pentagon = (5 * side * apothem) / 2
       // int sideP = 5;
       // float apothem = 3.4f;
       // float areaPentagon = (5 * sideP * apothem) / 2;
       // System.out.println("Pentagon Area : " + areaPentagon);
        
        // 3. Hexagon = (3 * sqrt(3) * side^2) / 2
        //int sideH = 6;
       // double areaHexagon = (3 * Math.sqrt(3) * sideH * sideH) / 2;
       // System.out.println("Hexagon Area : " + areaHexagon);
        

        // 4. Octagon = 2 * (1 + sqrt(2)) * side^2
        //int sideO = 4;
       // double areaOctagon = 2 * (1 + Math.sqrt(2)) * sideO * sideO;
       // System.out.println("Octagon Area : " + areaOctagon);
        

        // 5. Trapezoid = ((a + b) / 2) * height
       // float a = 5, b = 7, h = 4;
        //float areaTrapezoid = ((a + b) / 2) * h;
        //System.out.println("Trapezoid Area : " + areaTrapezoid);
        
        
        //2-------VOLUME OF =SPHERE,HEMISPHERE,CONE,CUBOID------------->
       // System.out.println(" VOLUME ");
        // 1. Sphere = (4/3) * PI * r^3
        //int r = 3;
        //double volSphere = (4.0/3.0) * Math.PI * r * r * r;
        //System.out.println("Sphere Volume : " + volSphere);
        

        // 2. Hemisphere = (2/3) * PI * r^3
       // double volHemisphere = (2.0/3.0) * Math.PI * r * r * r;
       // System.out.println("Hemisphere Volume : " + volHemisphere);
        

        // 3. Cone = (1/3) * PI * r^2 * h
       // int hCone = 5;
       // double volCone = (1.0/3.0) * Math.PI * r * r * hCone;
       // System.out.println("Cone Volume : " + volCone);
        

        // 4. Cuboid = l * b * h
       // int l = 2, br = 3, ht = 4;
        //int volCuboid = l * br * ht;
       // System.out.println("Cuboid Volume : " + volCuboid);
        
        
        // 3--------------------MATH METHOD------------------------>
        //double angle = 30;
       // System.out.println("sin(30) : " + Math.sin(Math.toRadians(angle)));
       // System.out.println("cos(30) : " + Math.cos(Math.toRadians(angle)));
       // System.out.println("tan(30) : " + Math.tan(Math.toRadians(angle)));
        

        // toRadians, toDegrees
        //System.out.println("30 degree to Radian : " + Math.toRadians(30));
       // System.out.println("PI Radian to Degree : " + Math.toDegrees(Math.PI));
        

        // exp, log, log10, signum
       // System.out.println("exp(2) : " + Math.exp(2));        // e^2
       // System.out.println("log(10) : " + Math.log(10));      // log
       // System.out.println("log10(100) : " + Math.log10(100));// 2.0
       // System.out.println("signum(-25) : " + Math.signum(-25)); // -1.0
       // System.out.println("signum(25) : " + Math.signum(25));   // 1.0

    //------------------------STRING METHOD--------------------------->
        String name = "job";
        String s1 = "experience";
        String s2 = "salary";
        String s3 = "SALARY";
        
        System.out.println(" Compare ");
        System.out.println("equals : " + s1.equals(s2));
        System.out.println("equalsIgnoreCase : " + s1.equalsIgnoreCase(s2));
        
        System.out.println("compareTo : " + s1.compareTo(s2));
        System.out.println("compareToIgnoreCase : " + s1.compareToIgnoreCase(s2));
        
        System.out.println("\n Search ");
        System.out.println("indexOf o : " + name.indexOf("o"));
        System.out.println("lastIndexOf o : " + name.lastIndexOf("o"));
        
        System.out.println("startsWith j : " + name.startsWith("j"));
        System.out.println("endsWith o : " + name.endsWith("o"));
        System.out.println("contains b : " + name.contains("b"));
        
        System.out.println("\n Change ");
        System.out.println("Upper : " + name.toUpperCase());
        System.out.println("Lower : " + name.toLowerCase());
        
        String check = " abinaya ";
        System.out.println("Trim : '" + check.trim() + "'");
        System.out.println("Replace C->B : " + "Call Cat".replace("C", "B"));
        System.out.println("Concat : " + s3.concat("Java"));
        
        System.out.println("\n Get Info ");
        System.out.println("Length : " + name.length());
        System.out.println("charAt 2 : " + name.charAt(2));
        System.out.println("substring 1 to 3 : " + name.substring(1, 3));
        System.out.println("isEmpty : " + "".isEmpty());
        System.out.println("valueOf 100 : " + String.valueOf(100));
    }
}
      