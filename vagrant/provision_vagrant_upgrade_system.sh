#!/bin/bash

vagrant up $1 --no-provision
vagrant provision $1 --provision-with=update_system
