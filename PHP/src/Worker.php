<?php

class Worker extends Person
{
    private int $id;
    public static array $WORKER_LIST = array();
    private Industry $industry;
    private bool $isFreeToWork;
    private CV $cv;

    /**
     * @param int $id
     * @param Industry $industry
     */
    public function __construct(int $id, String $name, Industry $industry)
    {
        $this->id = $id;
        $this->industry = $industry;
        $this->name = $name;
        $this->registerInSystem();
    }

    /**
     * @return Industry
     */
    public function getIndustry(): Industry
    {
        return $this->industry;
    }

    /**
     * @param Industry $industry
     */
    public function setIndustry(Industry $industry): void
    {
        $this->industry = $industry;
    }

    /**
     * @return bool
     */
    public function isFreeToWork(): bool
    {
        return $this->isFreeToWork;
    }

    /**
     * @param bool $isFreeToWork
     */
    public function setIsFreeToWork(bool $isFreeToWork): void
    {
        $this->isFreeToWork = $isFreeToWork;
    }

    public function __toString(): string
    {
        return "{$this->name} {$this->id} working in {$this->industry->name}";
    }

    public function registerInSystem(): void
    {
        array_push(self::$WORKER_LIST, $this);
    }

    public function updateCV(CV $cv):void
    {
        $this->cv = $cv;
    }
}