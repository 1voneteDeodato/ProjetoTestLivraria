package ProjetoLivraria.Test;

import java.lang.annotation.Documented;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import jdk.jshell.SourceCodeAnalysis;
import org.hibernate.param.ParameterBinder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.context.support.RequestHandledEvent;
import io.swagger.annotations.SwaggerDefinition;
import springfox.documentation.builders.ApilnfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.buiders.PathSelectors;
import springfox.documentation.buiders.RequestHandlerSelectors;
import springfox.documentation.shema.ModelRef;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.security.auth.message.callback.SecretKeyCallback;

@Configuration
public class LivroConfig {

    @Bean
    public Docket LivroApi() {

        ParameterBuinder parameterBuinder = new ParameterBinder();
        List<Parameter> params = new ArrayList<>();
        parameterBuinder.name("Authorization").modelRef(new ModelRef("string"))
                .parameterType("header")
                .required(false)
                .build();

        params.add(paramBuider.build());
        Docket docket = new Docket(DocumentationType.Swagger_2);

        docket
                .globalOperationParamenters(params)
                .select()
                .apis(RequestHandlerSelectors.basePackage("livro Swagger"))
                .build()
                .apiInfo(this.informacoesApi().builder())
                .consumes(new HashSet<String>(Arrays.asList("application/json")))
                .produces(new HashSet<String>(Arrays.asList("application/json")));

        return docket;
    }

    private ApiInfoBuilder informacoesApi() {

        ApiInfoBuilder.title("API");

        return apiInfoBuilder;

    }

    }

