package lesson6;

class Computer {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        computer1.setVideoCard("GeForce RTX 3080");
        computer1.setProcessor("Intel Core i9");
        computer1.setRAM("32GB");
    }

    String videoCard;
    String processor;
    String RAM;

    public Computer() {
        videoCard = "Видеокарта не указана";
        processor = "Процессор не указан";
        RAM = "Оперативная память не указана";
    }
    public Computer(String videoCard, String processor, String RAM) {
        this.videoCard = videoCard;
        this.processor = processor;
        this.RAM = RAM;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }
    public void setProcessor(String processor) {
        this.processor = processor;
    }
    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getVideoCard() {
        return videoCard;
    }
    public String getProcessor() {
        return processor;
    }
    public String getRAM() {
        return RAM;
    }
}
