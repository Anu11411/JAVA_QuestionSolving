public class Exercise4 {
    public static void main(String[] args) {
        String s_1 ="Welcome to java";
  String _2 ="Programmimg is fun";
  String s_3 ="Welcome to java";
  System.out.println(s_1==_2);
  System.out.println(_2==s_3);
  System.out.println(s_1.equals(_2));
  System.out.println(s_1.equals(s_3));
  System.out.println(s_1.compareTo(_2));
  System.out.println(_2.compareTo(s_3));
  System.out.println(_2.compareTo(_2));
  System.out.println(s_1.charAt(0));
  System.out.println(s_1.indexOf('j'));
  System.out.println(s_1.indexOf("o"));
  System.out.println(s_1.lastIndexOf('a'));
  System.out.println(s_1.lastIndexOf("o",15));
  System.out.println(s_1.length());
  System.out.println(s_1.substring(5));
  System.out.println(s_1.startsWith("Wel"));
  System.out.println(s_1.endsWith("java"));
  System.out.println(s_1.toLowerCase());
  System.out.println(s_1.toUpperCase());
  System.out.println(s_1.concat(_2));
  System.out.println(s_1.contains(_2));
  System.out.println("\t Wel \t".trim());
  System.out.println("______________________________________________");
  String s = "Welcome to Java";
  String su = s_1 +_2 ;
  System.out.println(su);
  String suu = s_1 + _2;
  System.out.println(suu);
  System.out.println(s_1 == _2);
  //System.out.println(s_1 >= _2);
  System.out.println(s_1.compareTo(_2));
  int i = s_1.length();
  System.out.println(i);
  //char c = s_1(0);
  //char c = s_1.charAt(s_1.length());
    System.out.println("1"+1);
    System.out.println('1'+1);
    System.out.println("1"+1+1);
    System.out.println("1"+(1+1));
    System.out.println('1'+1+1);

    System.out.println(1+"Welcome"+1+1);
    System.out.println(1+"Welcome"+(1+1));
    System.out.println(1+"Welcome"+('\u0001'+1));
    System.out.println(1+"Welcome"+'a'+1);
    System.out.println("_____________________________");
  String s1 ="Welcome";
  String s2="welcome";
  //boolean b=(s1==s2);
  //boolean isEqual= s1.equals(s2);
  //System.out.println(isEqual);
//boolean isEqual=s1.equalsIgnoreCase(s2);
//System.out.println(isEqual);
//int x = s1.compareTo(s2);
//System.out.println(x);
//int x =s1.compareToIgnoreCase(s2);
//System.out.println(x);
//boolean b = s1.startsWith("AAA");
//System.out.println(b);
//boolean b=s1.endsWith("AAA");
//System.out.println(b);
//int x = s1.length();
//System.out.println(x);
/*char x =s1.charAt(0);
System.out.println(x);
String s3= s1.concat(s2);
System.out.println(s3);
System.out.println(s1.substring(1));*/
 System.out.println(s1.substring(1,4));
//String s3 =s1.toLowerCase();
//System.out.println(s3);
//String s3 = s1.toUpperCase();
//System.out.println(s3);
//String s3 =s1.trim();
//System.out.println(s3);
//int x =s1.indexOf('e');
//System.out.println(x);
String target="abc";
int x=s1.lastIndexOf(target);
System.out.println(x);
}
}
