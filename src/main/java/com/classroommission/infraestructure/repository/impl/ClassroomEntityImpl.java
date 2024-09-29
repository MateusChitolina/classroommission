package com.classroommission.infraestructure.repository.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.classroommission.infraestructure.entity.ClassroomAssignmentsEntity;
import com.classroommission.infraestructure.entity.ClassroomEntity;
import com.classroommission.infraestructure.repository.ClassroomRepository;

@Repository
public class ClassroomEntityImpl implements ClassroomRepository {

  @Override
  public List<ClassroomEntity> findAllByUserId(String userId) {
    //userId só para bonito
    return Arrays.asList(
      new ClassroomEntity("IJ - Reuso de Software", "Grp00523", "", "https://gstatic.com/classroom/themes/img_learnlanguage.jpg", "https://lh3.googleusercontent.com/a/ACg8ocKujuJCFDdokG6Fw-NRSYvIvujOwT5azHN6tqyg5aRRZSWvmA=s75-c-mo", Arrays.asList(new ClassroomAssignmentsEntity("3b31edc4-5fc6-4891-b295-d190d7d2bf60","Data de entrega: terça-feira","19:30 - Trabalho 1"), new ClassroomAssignmentsEntity("19af8834-a3c2-44f1-b265-ee7d7110984f","Data de entrega: quarta-feira","19:30 - Trabalho 2"))),
      new ClassroomEntity("Verificação e Validação de Software", "GP03063", "", "https://gstatic.com/classroom/themes/Honors.jpg", "https://lh3.googleusercontent.com/a-/ALV-UjUOlKhuP5UquyLPwuEzGKFOEiR7AlX9R1OZ4CcgQ38TsQ_Gti8X=s75-c", null),
      new ClassroomEntity("IJ - Programação para Interface de Usuário", "Grp00537", "", "https://gstatic.com/classroom/themes/Chemistry.jpg", "https://lh3.googleusercontent.com/a/ACg8ocIEFObV7h99SSGR-jhPI0Mj9WOUfz-67NsPucsLzPr1Ck6vQw=s75-c-mo", null),
      new ClassroomEntity("RS - Programação para Interface de Usuário", "Grp00537", "", "https://gstatic.com/classroom/themes/img_read.jpg", "https://lh3.googleusercontent.com/a-/ALV-UjVUojLAsXB1bfaHlwRs3FAVLqVpqqJS70eqiXmNflLeUHtPhcs=s75-c", Arrays.asList(new ClassroomAssignmentsEntity("6d7c334a-49bd-4385-9850-ae577003d578","Data de entrega: sexta-feira","19:30 - Trabalho 3"))),
      new ClassroomEntity("RS - Reuso de Software", "Grp00523", "", "https://gstatic.com/classroom/themes/img_reachout.jpg", "https://lh3.googleusercontent.com/a-/ALV-UjWhXEJ9szagePUGNuHmc0WlSao_IC50ZExj19_D4KQlu7ku8ZVx=s75-c", null),
      new ClassroomEntity("Maratona de Programação", "", "",  "https://gstatic.com/classroom/themes/img_learnlanguage.jpg", "https://lh3.googleusercontent.com/a/ACg8ocKujuJCFDdokG6Fw-NRSYvIvujOwT5azHN6tqyg5aRRZSWvmA=s75-c-mo", Arrays.asList(new ClassroomAssignmentsEntity("2dc4f979-7e83-47e0-80d2-b9e5f62f9f39","Data de entrega: segunda-feira","19:30 - Trabalho 4"), new ClassroomAssignmentsEntity("19af8834-a3c2-44f1-b265-ee7d7110984f","Data de entrega: quinta-feira","19:30 - Trabalho 5"), new ClassroomAssignmentsEntity("8d430b91-e86b-486c-9ff3-9aabdd725ce5","Data de entrega: terça-feira","19:30 - Trabalho 6"))),
      new ClassroomEntity("Ambiente de Apoio Pedagógico", "Espaço para Materiais de Apoio Pedagógico", "Núcleo de Inovação Pedagógico", "https://gstatic.com/classroom/themes/Honors.jpg", "https://lh3.googleusercontent.com/a-/ALV-UjUOlKhuP5UquyLPwuEzGKFOEiR7AlX9R1OZ4CcgQ38TsQ_Gti8X=s75-c", null),
      new ClassroomEntity("Plano de Ensino Individual", "Ciências da computação", "Setor de Educação", "https://gstatic.com/classroom/themes/Chemistry.jpg", "https://lh3.googleusercontent.com/a/ACg8ocIEFObV7h99SSGR-jhPI0Mj9WOUfz-67NsPucsLzPr1Ck6vQw=s75-c-mo", null)
    );
  }

}
