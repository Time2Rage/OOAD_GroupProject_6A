<?php

interface Communication
{
    public function sendMessage(String $recipient, String $message) : void;
}