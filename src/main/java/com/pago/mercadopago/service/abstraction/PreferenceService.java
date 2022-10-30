package com.pago.mercadopago.service.abstraction;

import com.pago.mercadopago.model.dto.PreferenceRequest;
import com.pago.mercadopago.model.dto.PreferenceResponse;

public interface PreferenceService {
    PreferenceResponse preference(PreferenceRequest request);
}
