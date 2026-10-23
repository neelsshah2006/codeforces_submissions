#include <iostream>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    int n;
    cin >> n;
    int pos = 0, neg = 0, even = 0, tmp;
    for (int i = 0; i < n; i++)
    {
        cin >> tmp;
        if (tmp > 0)
            pos++;
        else if (tmp < 0)
            neg++;

        if (tmp % 2 == 0)
            even++;
    }

    cout << "Even: " << even << '\n';
    cout << "Odd: " << n - even << '\n';
    cout << "Positive: " << pos << '\n';
    cout << "Negative: " << neg << '\n';
    return 0;
}