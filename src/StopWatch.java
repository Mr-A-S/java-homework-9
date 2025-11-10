public class StopWatch {

    // --- Поля данных ---
    // Скрытые (private) поля для времени начала и конца замера.
    // Используем тип 'long', так как System.currentTimeMillis() возвращает long.
    private long startTime;
    private long endTime;

    // --- Конструктор ---
    // Безаргументный конструктор, который инициализирует startTime текущим временем.
    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    // --- Getter-методы ---
    // Методы для получения доступа к скрытым полям.
    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    // --- Основные методы ---
    /**
     * Сбрасывает startTime до текущего времени.
     */
    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    /**
     * Присваивает endTime текущее время.
     */
    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    /**
     * Возвращает прошедшее время на секундомере в миллисекундах.
     * @return разница между endTime и startTime.
     */
    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}