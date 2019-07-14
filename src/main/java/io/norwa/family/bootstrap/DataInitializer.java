package io.norwa.family.bootstrap;

import io.norwa.family.domain.Child;
import io.norwa.family.domain.Parent;
import io.norwa.family.domain.ParentPK;
import io.norwa.family.repositories.ChildRepository;
import io.norwa.family.repositories.ParentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@RequiredArgsConstructor
@Component
public class DataInitializer implements ApplicationListener<ContextRefreshedEvent> {

    private final ParentRepository parentRepository;

    private final ChildRepository childRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    @Transactional
    public void initData(){
        log.info("---DATA INITI---");
        Parent parent = new Parent(new ParentPK("Jan","Kowalski"),"father");
        Child child = new Child();
        child.setParent(parent);
        child.setFirstName("Hieronim");
        child.setLastName("Kowalski");


        parentRepository.save(parent);

        childRepository.save(child);

        log.info("---DATA INITI END---");
    }
}
