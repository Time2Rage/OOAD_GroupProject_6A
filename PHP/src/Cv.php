<?php

class Cv
{
    private String $date;
    private String $content;

    public function __construct(String $date, String $content)
    {
        $this->date = $date;
        $this->content = $content;
    }


    /**
     * @return String
     */
    public function getContent(): string
    {
        return $this->content;
    }

    /**
     * @return String
     */
    public function getDate(): String
    {
        return $this->date;
    }

    public function __toString(): string
    {
        return $this->content;
    }


}