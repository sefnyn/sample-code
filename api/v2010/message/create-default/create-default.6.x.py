# Download the helper library from https://www.twilio.com/docs/python/install
from twilio.rest import Client


# Your Account Sid and Auth Token from twilio.com/console
account_sid = 'AC4a73d0d38c01eba4bb0e91259c7b19c7'
auth_token = 'c7e8bfe73c5ec031617ad3d54dafe089'
client = Client(account_sid, auth_token)

message = client.messages.create(
                              from_='+15017122661',
                              body='body',
                              to='+15558675310'
                          )

print(message.sid)
