package task_2;
/*
Створіть 2 інтерфейси Playable та Recordable. У кожному з інтерфейсів створіть по 3 методи void play() / void pause() /
void stop() та void record() / void pause() / void stop() відповідно. Створіть похідний клас Player від базових
інтерфейсів Playable та Recordable. Написати програму, яка виконує програвання та запис.
 */
public interface Playable {
    void play();
    void pause();
    void stop();
}
