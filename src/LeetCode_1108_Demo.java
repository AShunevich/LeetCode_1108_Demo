public class LeetCode_1108_Demo {
    static formatIp formatIp;

//use this to run demo
    public static void main(String[] args) {
        formatIp = new formatIp();
        String s = "255.255.255.0";
        System.out.println(formatIp.defIpAdr(s));
    }
}

//implementantion of LeetCode 1108. Defanging an IP Address
class formatIp {
    //copy this, if you want
    public String defIpAdr(String address) {
        StringBuilder strBd = new StringBuilder();
        for (char ch : address.toCharArray()) {
            if (ch == '.') {
                strBd.append('[').append(ch).append(']');
            } else strBd.append(ch);
        }
        return strBd.toString();
    }
}

