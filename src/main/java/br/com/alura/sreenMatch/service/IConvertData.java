package br.com.alura.sreenMatch.service;

public interface IConvertData {
    <T> T getData(String json, Class<T> classe);
}
