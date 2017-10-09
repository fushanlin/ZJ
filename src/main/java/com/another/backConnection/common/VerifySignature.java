package com.another.backConnection.common;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
/**
 * Created by Administrator on 2017/3/16 0016.
 */
public class VerifySignature {
    public void run1() {
        try {
            String pubkeyvalue = "30819f300d06092a864886f70d01010105";//这是GenerateKeyPair输出的公钥编码
            X509EncodedKeySpec bobPubKeySpec = new X509EncodedKeySpec(hexStrToBytes(pubkeyvalue));
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            PublicKey pubKey = keyFactory.generatePublic(bobPubKeySpec);


            String info = "orderId=10dkfadsfksdkssdkd&amount=80&orderTime=20060519";
            byte[] signed = hexStrToBytes("2292e02ba6bf6f1b1688a6fa2");//这是SignatureData输出的数字签名
            java.security.Signature signetcheck=java.security.Signature.getInstance("MD5withRSA");
            signetcheck.initVerify(pubKey);
            signetcheck.update(info.getBytes());
            if (signetcheck.verify(signed)) {
                System.out.println("info=" + info);
                System.out.println("签名正常");
            }
            else System.out.println("非签名正常");
        }
        catch (java.lang.Exception e) {e.printStackTrace();}
    }
    /**
     * Transform the specified byte into a Hex String form.
     */
    public static final String bytesToHexStr(byte[] bcd) {
        StringBuffer s = new StringBuffer(bcd.length * 2);

        for (int i = 0; i < bcd.length; i++) {
            s.append(bcdLookup[(bcd[i] >>> 4) & 0x0f]);
            s.append(bcdLookup[bcd[i] & 0x0f]);
        }

        return s.toString();
    }

    /**
     * Transform the specified Hex String into a byte array.
     */
    public static final byte[] hexStrToBytes(String s) {
        byte[] bytes;

        bytes = new byte[s.length() / 2];

        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) Integer.parseInt(s.substring(2 * i, 2 * i + 2),
                    16);
        }

        return bytes;
    }

    private static final char[] bcdLookup = { '0', '1', '2', '3', '4', '5',
            '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
}


