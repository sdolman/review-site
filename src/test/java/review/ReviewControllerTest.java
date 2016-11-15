package review;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

public class ReviewControllerTest {
	@InjectMocks
	private ReviewController underTest; 
	
	@Mock
	private ReviewRepository repository;
	@Mock
	private Review review;
	@Mock
	private Model model;
	@Mock
	Collection<Review> reviews;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void shouldAddReviewInTheModel() {
		long id = 42;
		when(repository.findById(id)).thenReturn(review);
		underTest.displayReview(id, model);
		verify(model).addAttribute("selectedReview", review);
	}
	
	@Test
	public void shouldReturnSingleReviewView() {
		String result = underTest.displayReview(42, model);
		assertEquals("review-view", result);
				
	}
	
	@Test
	public void shouldReturnReviewAll() {
		String result = underTest.displayAllReviews(model);
		assertEquals("review-all", result);
	}
	
	@Test
	public void shouldAddAllReviewsInTheModel() {
		when(repository.findAll()).thenReturn(reviews);
		underTest.displayAllReviews(model);
		verify(model).addAttribute("reviews",reviews);
	}
	

}
