package lesson4.lowPackage;

/**
 * Created by asv on 15.05.17.
 */
public class B {

    public String publicFieldInB = "publicFieldInB";
    String fieldInB = "fieldInB";
    protected String protectedFieldInB = "protectedFieldInB";
    private String privateFieldInB = "privateFie    ldInB";


    public String getPrivateFieldInB() {
        return privateFieldInB;
    }

    public void setPrivateFieldInB(String privateFieldInB) {
        this.privateFieldInB = privateFieldInB;
    }
}
