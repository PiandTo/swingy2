package edu.school21.model;

public class Helm extends Entity implements ChangerHp{
    private int amount;

    @Override
    public void change(HeroDto heroDto) {
        heroDto.setAttack(heroDto.getAttack() + amount);
    }
}
