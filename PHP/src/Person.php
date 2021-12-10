<?php

require_once "interface/Communication.php";

abstract class Person implements Communication
{
    protected String $name;
    protected String $picture;
    protected String $password;
    protected bool $isActive = true;

    /**
     * @return String
     */
    public function getName(): string
    {
        return $this->name;
    }

    /**
     * @param String $name
     */
    public function setName(string $name): void
    {
        $this->name = $name;
    }

    /**
     * @return String
     */
    public function getPicture(): string
    {
        return $this->picture;
    }

    /**
     * @param String $picture
     */
    public function setPicture(string $picture): void
    {
        $this->picture = $picture;
    }

    /**
     * @return String
     */
    public function getPassword(): string
    {
        return $this->password;
    }

    /**
     * @param String $password
     */
    public function setPassword(string $password): void
    {
        $this->password = $password;
    }

    /**
     * @return bool
     */
    public function isActive(): bool
    {
        return $this->isActive;
    }

    /**
     * @param bool $isActive
     */
    public function setIsActive(bool $isActive): void
    {
        $this->isActive = $isActive;
    }

    public function sendMessage(string $recipient, string $message): void
    {
        // TODO: Implement sendMessage() method.
    }

}