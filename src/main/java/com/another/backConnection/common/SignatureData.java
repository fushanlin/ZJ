package com.another.backConnection.common;

import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;

/**
 * Created by Administrator on 2017/3/16 0016.
 */
public class SignatureData {
    public void run() {
        try {
            String prikeyvalue = "30820276020100300d06092a864886f70d0101010500048202603082025c02010002818100a62e6eb44d667186bd7ae08bc1e2c91b16b31339e7915b0390dfd77c1193f43d52b9603c3a8cd8f7eb550be4ae3e00418260e43c6c654aceba41ae26b08490a235ce7d93b6f264eb49289a1969bf847d5da784fc038c5f40610c94d306b0d8bcd545c4a1a4ac7b47a0a8554a0d7deacd39853c633efb82316c2216895eb1f6cf020301000102818026102e9527c1563179870295a05434a1fac20b9e50b70f74b2a342b50d45a944be84ed50fe4c328a1ea1fd3664de98aa68958ed17436833af49884ae21f24b3a2dbdc87284eb3179b695e2b24ddc62c18f1305099e0cdfa01a0aacd5c128dfc06807fc29888fc920f9f3a3711dfed009358d6bd507687a757b5004d2af82e039024100d243c21ef72f2afcffb0dafcf909def545bbe0e4c07ca5c802ac262bcaa087042ba9547c2d3ff6527faca893604f60405df5e93938b918e1b3b0849c04ff4e53024100ca53f7d6f52e5ef09f53434b6e99a2166e2ba90f502f4c1a2f28537ee6d0fb493bff50965a4a3a8de60ced402d3e20d0662eb07e703e0c3b00ea4fa8e3a80e15024037c6116ff55165adc6853b116f5dd6ee6898f586b82858313dc43c3bd17bd3549fe042b0cdaff1bee06f0428539bba8458682a7d2b36ae0af0871a25e88d7051024061255e0b951f95b03d1fb2610692b7b3c3642d415003d5ab80d700f81e855b1237bf88071905290636de20103f68e4428bbd813ac453d6758223fee99d9d745d02410095b20ce1a46f5ee0a1709ea17015051bf9d31796ac1d72ebc53f0a1e2f1b9e2667daeeba36ffb826129b2b36f7f262bf0073baaf98b0d8ec0b5896c7c12a231e";//这是GenerateKeyPair输出的私钥编码
            PKCS8EncodedKeySpec priPKCS8 = new PKCS8EncodedKeySpec(hexStrToBytes(prikeyvalue));
            KeyFactory keyf = KeyFactory.getInstance("RSA");
            PrivateKey myprikey = keyf.generatePrivate(priPKCS8);

            String myinfo = "TranAbbr=IPER|OrderId=20101111163701911000|MerchantDateTime=20101111163701|TransAmount=1.80|MerchantUrl=http%3A%2F%2F10.112.9.182%3A81%2Flocal%2Freceive.jsp|MerchantId=1000000010001000001|TermCode=001|Remark1=|Remark2="; // 要签名的信息
            // 用私钥对信息生成数字签名
            java.security.Signature signet = java.security.Signature
                    .getInstance("MD5withRSA");
            signet.initSign(myprikey);
            signet.update(myinfo.getBytes("ISO-8859-1"));
            byte[] signed = signet.sign(); // 对信息的数字签名

            System.out.println("signed(签名内容)原值=" + bytesToHexStr(signed));
            System.out.println("info（原值）=" + myinfo);


            System.out.println("签名并生成文件成功");
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            System.out.println("签名并生成文件失败");
        }
        ;

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

    private static final char[] bcdLookup = {'0', '1', '2', '3', '4', '5',
            '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SignatureData s = new SignatureData();
        s.run();

    }
}
