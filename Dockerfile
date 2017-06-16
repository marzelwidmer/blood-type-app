FROM resin/rpi-raspbian:jessie
#
## Install OpenJDK 8
RUN apt-get update
	&& apt-get install -y openjdk-8-jdk
	# Remove package lists to free up space
	&& rm -rf /var/lib/apt/lists/*
#
#ADD . /App/
#RUN mv /App/run.sh /run.sh
#
#CMD ["bash", "run.sh"]

