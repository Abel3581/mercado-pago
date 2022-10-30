package com.pago.mercadopago.service;

import com.pago.mercadopago.model.dto.PreferenceRequest;
import com.pago.mercadopago.model.dto.PreferenceResponse;
import com.pago.mercadopago.service.abstraction.PreferenceService;
import org.springframework.stereotype.Service;

@Service
public class PreferenceServiceImpl implements PreferenceService {
    @Override
    public PreferenceResponse preference(PreferenceRequest request) {
        return null;
    }
}
