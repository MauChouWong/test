package com.hmz.demo.utils;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Base64Util {
    public static final String DEFAULT_CHARSET = "utf-8";

    public static String encode(String plaintext) throws UnsupportedEncodingException {
        return encode(plaintext, DEFAULT_CHARSET);
    }

    public static String encode(String plaintext, String charset) throws UnsupportedEncodingException {
        Base64.Encoder encoder = Base64.getEncoder();
        byte[] bytes = encoder.encode(plaintext.getBytes(charset));
        return new String(bytes, charset);
    }

    public static String decode(String ciphertext) throws UnsupportedEncodingException {
        return decode(ciphertext, DEFAULT_CHARSET);
    }
    public static String decode(String ciphertext, String charset) throws UnsupportedEncodingException {
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] decode = decoder.decode(ciphertext.getBytes(charset));
        return new String(decode, charset);
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        String encode = Base64Util.encode("你好啊全世界");
        System.out.println(encode);
        String decode = Base64Util.decode(encode);
        System.out.println(decode);
    }
}
