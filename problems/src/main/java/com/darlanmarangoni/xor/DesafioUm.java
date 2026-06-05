package com.darlanmarangoni.xor;

import java.util.List;

public class DesafioUm {

    public int getNumeroUnico(List<Integer> lista){
        int numeroUnico = 0;
        for(Integer integer : lista){
            numeroUnico ^= integer;
        }
        return numeroUnico;
    }
}
