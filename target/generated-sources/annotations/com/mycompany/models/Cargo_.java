package com.mycompany.models;

import com.mycompany.models.Funcionario;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-06T13:07:52", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Cargo.class)
public class Cargo_ { 

    public static volatile SingularAttribute<Cargo, String> nome;
    public static volatile SingularAttribute<Cargo, Integer> id;
    public static volatile ListAttribute<Cargo, Funcionario> funcionarios;

}