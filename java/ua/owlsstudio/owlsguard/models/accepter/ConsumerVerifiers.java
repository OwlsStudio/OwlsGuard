package ua.owlsstudio.owlsguard.models.accepter;

import ua.owlsstudio.owlsguard.models.impl.*;

public class ConsumerVerifiers {

    private OwlsConsumer consumerVerifiers;
    private Class iMainClass;

    public ConsumerVerifiers(Class iMainClass, OwlsConsumer consumerVerifiers) {
        this.iMainClass = iMainClass;
        this.consumerVerifiers = consumerVerifiers;
    }

    public OwlsConsumer getConsumerVerifiers() {
        return consumerVerifiers;
    }
}
