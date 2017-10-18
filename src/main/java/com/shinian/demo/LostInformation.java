package com.shinian.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author shinian
 * @date 2017/10/18/018
 */
public class LostInformation {
    public static void main(String[] args) {
        List<Frob> list = new ArrayList<Frob>();
        System.out.println(Arrays.toString(list.getClass().getTypeParameters()));

        Map<Frob, Fnorkle> map = new HashMap<>(5);
        System.out.println(Arrays.toString(map.getClass().getTypeParameters()));

        Quark<Fnorkle> quark = new Quark<>();
        System.out.println(Arrays.toString(quark.getClass().getTypeParameters()));
    }

}

class Frob {
}

class Fnorkle {
}

class Quark<Q> {
}

class Particle<POSITION> {
}
