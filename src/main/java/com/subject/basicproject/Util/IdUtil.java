package com.subject.basicproject.Util;

import java.util.UUID;

public class IdUtil {
    public static String genId() {
        return UUID.randomUUID().toString();
    }
}
