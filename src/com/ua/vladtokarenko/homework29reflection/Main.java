package com.ua.vladtokarenko.homework29reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException {
        Field[] fields = Reflection.class.getDeclaredFields();

        List<Field> publicFields = new ArrayList<>();
        List<Field> privateFields = new ArrayList<>();
        List<Field> protectedFields = new ArrayList<>();
        List<Field> otherFields = new ArrayList<>();

        for (Field field : fields) {
            int modifiers = field.getModifiers();
            if (Modifier.isPublic(modifiers)) {
                publicFields.add(field);
            } else if (Modifier.isPrivate(modifiers)) {
                privateFields.add(field);
            } else if (Modifier.isProtected(modifiers)) {
                protectedFields.add(field);
            } else {
                otherFields.add(field);
            }
        }

        System.out.println("Public fields:");
        for (Field field : publicFields) {
            System.out.println(field.getName());
        }

        System.out.println("Private fields:");
        for (Field field : privateFields) {
            System.out.println(field.getName());
        }

        System.out.println("Protected fields:");
        for (Field field : protectedFields) {
            System.out.println(field.getName());
        }

        System.out.println("Other fields:");
        for (Field field : otherFields) {
            System.out.println(field.getName());
        }
    }
}


