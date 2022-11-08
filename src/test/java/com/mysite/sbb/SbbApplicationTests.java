package com.mysite.sbb;

import com.mysite.sbb.answer.Answer;
import com.mysite.sbb.answer.AnswerRepository;
import com.mysite.sbb.question.Question;
import com.mysite.sbb.question.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SbbApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;

	@Autowired
	private AnswerRepository answerRepository;

	@Transactional
	@Test
	void testJpa() {

		Optional<Question> oa = questionRepository.findById(2);
		assertTrue(oa.isPresent());
		Question q = oa.get();

		List<Answer> list = q.getAnswerList();

		assertEquals(1, list.size());
		assertEquals("네 자동으로 생성됩니다.", list.get(0).getContent());

//		Optional<Answer> oa = this.answerRepository.findById(1);
//		assertTrue(oa.isPresent());
//		Answer a = oa.get();
//		assertEquals(2, a.getQuestion().getId());

//		Optional<Question> oq = this.questionRepository.findById(2);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//
//		Answer a = new Answer();
//		a.setContent("네 자동으로 생성됩니다.");
//		a.setQuestion(q); // 어떤 질문의 답변인지 알기 위해선 Question 객체가 필요
//		this.answerRepository.save(a);

//		assertEquals(2, this.questionRepository.count());
//		Optional<Question> oq = this.questionRepository.findById(1);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//		this.questionRepository.delete(q);
//		assertEquals(1, this.questionRepository.count());

//		Optional<Question> oq = this.questionRepository.findById(1);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//		q.setSubject("수정된 제목");
//		this.questionRepository.save(q);

//		List<Question> questionList = this.questionRepository.findBySubjectLike("스프링%");
//		Question q = questionList.get(0);
//		assertEquals("스프링부트 모델 질문입니다.", q.getSubject());


//		Question q = this.questionRepository.findBySubjectAndContent("What is sbb?", "I need to know 'sbb'");
//		assertEquals(4, q.getId());

//		Question q = this.questionRepository.findBySubject("What is sbb?");
//		assertEquals(1, q.getId());

//		Optional<Question> oq = this.questionRepository.findById(1);
//
//		if (oq.isPresent()) {
//			Question q = oq.get();
//			assertEquals("What is sbb?", q.getSubject());
//		}

//		List<Question> all = this.questionRepository.findAll();
//		assertEquals(2, all.size());
//
//		Question q = all.get(0);
//		assertEquals("What is sbb?", q.getSubject());

//		Question q1 = new Question();
//		q1.setSubject("What is sbb?");
//		q1.setContent("I need to know 'sbb'");
//		q1.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q1);
//
//		Question q2 = new Question();
//		q2.setSubject("스프링부트 모델 질문입니다.");
//		q2.setContent("ID는 자동으로 생성되나요?");
//		q2.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q2);
	}

}
