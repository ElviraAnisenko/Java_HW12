import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.PosterManager;
import ru.netology.domain.PosterProperties;

public class PosterManagerTest {
    PosterProperties poster1 = new PosterProperties(100, "Бладшот");
    PosterProperties poster2 = new PosterProperties(101, "Вперед");
    PosterProperties poster3 = new PosterProperties(102, "Отель 'Белград'");
    PosterProperties poster4 = new PosterProperties(103, "Джентельмены");
    PosterProperties poster5 = new PosterProperties(104, "Человек-невидимка");
    PosterProperties poster6 = new PosterProperties(105, "Тролли. Мировой тур");
    PosterProperties poster7 = new PosterProperties(106, "Номер один");

    @Test
    public void shouldSave() {
        PosterManager manager = new PosterManager();
        manager.savePoster(poster1);
        manager.savePoster(poster2);
        manager.savePoster(poster3);
        PosterProperties[] expected = {poster1, poster2, poster3};
        PosterProperties[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowPosterUnderNearLimitWithDataEntry() {
        PosterManager manager = new PosterManager(7);
        manager.savePoster(poster1);
        manager.savePoster(poster2);
        manager.savePoster(poster3);
        manager.savePoster(poster4);
        manager.savePoster(poster5);
        manager.savePoster(poster6);
        PosterProperties[] expected = {poster6, poster5, poster4, poster3, poster2, poster1};
        PosterProperties[] actual = manager.findLast();
        ;
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowPosterEquallyLimitWithDataEntry() {
        PosterManager manager = new PosterManager(7);
        manager.savePoster(poster1);
        manager.savePoster(poster2);
        manager.savePoster(poster3);
        manager.savePoster(poster4);
        manager.savePoster(poster5);
        manager.savePoster(poster6);
        manager.savePoster(poster7);
        PosterProperties[] expected = {poster7, poster6, poster5, poster4, poster3, poster2, poster1};
        PosterProperties[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowPosterNearOverLimitWithDataEntry() {
        PosterManager manager = new PosterManager(6);
        manager.savePoster(poster1);
        manager.savePoster(poster2);
        manager.savePoster(poster3);
        manager.savePoster(poster4);
        manager.savePoster(poster5);
        manager.savePoster(poster6);
        manager.savePoster(poster7);
        PosterProperties[] expected = {poster7, poster6, poster5, poster4, poster3, poster2};
        PosterProperties[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowPosterUnderNearLimit() {
        PosterManager manager = new PosterManager();
        manager.savePoster(poster1);
        manager.savePoster(poster2);
        manager.savePoster(poster3);
        manager.savePoster(poster4);
        PosterProperties[] expected = {poster4, poster3, poster2, poster1};
        PosterProperties[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowPosterEquallyLimit() {
        PosterManager manager = new PosterManager();
        manager.savePoster(poster1);
        manager.savePoster(poster2);
        manager.savePoster(poster3);
        manager.savePoster(poster4);
        manager.savePoster(poster5);
        PosterProperties[] expected = {poster5, poster4, poster3, poster2, poster1};
        PosterProperties[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowPosterNearOverLimit() {
        PosterManager manager = new PosterManager();
        manager.savePoster(poster1);
        manager.savePoster(poster2);
        manager.savePoster(poster3);
        manager.savePoster(poster4);
        manager.savePoster(poster5);
        manager.savePoster(poster6);
        PosterProperties[] expected = {poster6, poster5, poster4, poster3, poster2};
        PosterProperties[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}


