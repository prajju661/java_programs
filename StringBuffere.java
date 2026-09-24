public class StringBuffere {
    public static void main(String[] a){
        StringBuffer str = new StringBuffer("Java Programming");
        System.out.println("Original:"+str);
        str.append(" Language");
        System.out.println("After Append:"+str);
        str.insert(5,"-");
        System.out.println("After Insert:"+str);
        str.replace(5,6,"_");
        System.out.println("After Replace:"+str);
        str.delete(5,6);
        System.out.println("After Delete:"+str);
    }
}
