package com.example.veiculo.service.impl;

import com.example.veiculo.model.Veiculo;
import com.example.veiculo.service.VeiculoService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class VeiculoServiceImpl implements VeiculoService {
    @Override
    public List<Veiculo> listarVeiculos() {
        return Arrays.asList(new Veiculo("Fiesta", "vermelho"), new Veiculo("Celta", "vermelho"), new Veiculo("S10", "roxo"));
    }
}
