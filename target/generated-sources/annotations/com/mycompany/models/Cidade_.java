package com.mycompany.models;

import com.mycompany.models.Cidade;
import com.mycompany.models.Endereco;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-06T13:07:52", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Cidade.class)
public class Cidade_ { 

    public static volatile SingularAttribute<Cidade, Cidade> cidade;
    public static volatile ListAttribute<Cidade, Endereco> enderecos;
    public static volatile SingularAttribute<Cidade, String> nome;
    public static volatile SingularAttribute<Cidade, Long> id;
    public static volatile ListAttribute<Cidade, Cidade> cidades;

}